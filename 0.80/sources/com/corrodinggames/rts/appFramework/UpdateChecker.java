package com.corrodinggames.rts.appFramework;

import android.content.Context;
import android.content.pm.PackageManager;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.SettingsEngine;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
/* loaded from: classes.jar:com/corrodinggames/rts/appFramework/UpdateChecker.class */
public class UpdateChecker {
    public static final String checkUrl = "http://update.corrodinggames.com/updateCheck/check";
    public static String updateMessage = null;
    public static int updateMessageId;
    public static boolean updateMessage_showAsMessageBox;

    public static void doBackgroundCheck(final Context context) {
        new Thread() { // from class: com.corrodinggames.rts.appFramework.UpdateChecker.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                SettingsEngine instance = SettingsEngine.getInstance(context);
                if (instance.uuid == null) {
                    instance.uuid = UUID.randomUUID().toString();
                    instance.save();
                }
                try {
                    DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
                    HttpPost httpPost = new HttpPost(UpdateChecker.checkUrl);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new BasicNameValuePair("versioncode", String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode)));
                    arrayList.add(new BasicNameValuePair("metacode", String.valueOf(5)));
                    arrayList.add(new BasicNameValuePair("token", instance.uuid));
                    httpPost.setEntity(new UrlEncodedFormEntity(arrayList, "UTF-8"));
                    String entityUtils = EntityUtils.toString(defaultHttpClient.execute(httpPost).getEntity());
                    GameEngine.log("UpdateChecker", entityUtils);
                    if (entityUtils.contains("<RUSTEDWARFARE>")) {
                        Matcher matcher = Pattern.compile(".*\\[(.*)\\]\\[(.*)\\]\\[(.*)\\].*", 40).matcher(entityUtils);
                        if (matcher.find()) {
                            String group = matcher.group(1);
                            String group2 = matcher.group(2);
                            String group3 = matcher.group(3);
                            UpdateChecker.updateMessage_showAsMessageBox = group.contains("messagebox");
                            int i = -1;
                            try {
                                i = Integer.valueOf(group2).intValue();
                            } catch (NumberFormatException e) {
                                e.printStackTrace();
                            }
                            UpdateChecker.updateMessageId = i;
                            UpdateChecker.updateMessage = group3;
                            return;
                        }
                        GameEngine.log("UpdateChecker", "match was not found for:");
                        GameEngine.log("UpdateChecker", entityUtils);
                        UpdateChecker.updateMessage = null;
                    }
                } catch (ClientProtocolException e2) {
                    e2.printStackTrace();
                } catch (PackageManager.NameNotFoundException e3) {
                    e3.printStackTrace();
                } catch (UnsupportedEncodingException e4) {
                    e4.printStackTrace();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
        }.start();
    }
}
