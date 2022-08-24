package android.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* loaded from: game-lib.jar:android/view/KeyEvent.class */
public class KeyEvent extends InputEvent implements Parcelable {

    /* renamed from: b */
    private static final SparseArray f312b = new SparseArray();

    /* renamed from: c */
    private static final String[] f313c = {"META_SHIFT_ON", "META_ALT_ON", "META_SYM_ON", "META_FUNCTION_ON", "META_ALT_LEFT_ON", "META_ALT_RIGHT_ON", "META_SHIFT_LEFT_ON", "META_SHIFT_RIGHT_ON", "META_CAP_LOCKED", "META_ALT_LOCKED", "META_SYM_LOCKED", "0x00000800", "META_CTRL_ON", "META_CTRL_LEFT_ON", "META_CTRL_RIGHT_ON", "0x00008000", "META_META_ON", "META_META_LEFT_ON", "META_META_RIGHT_ON", "0x00080000", "META_CAPS_LOCK_ON", "META_NUM_LOCK_ON", "META_SCROLL_LOCK_ON", "0x00800000", "0x01000000", "0x02000000", "0x04000000", "0x08000000", "0x10000000", "0x20000000", "0x40000000", "0x80000000"};

    /* renamed from: d */
    private static final Object f314d = new Object();

    /* renamed from: e */
    private int f315e;

    /* renamed from: f */
    private int f316f;

    /* renamed from: g */
    private int f317g;

    /* renamed from: h */
    private int f318h;

    /* renamed from: i */
    private int f319i;

    /* renamed from: j */
    private int f320j;

    /* renamed from: k */
    private int f321k;

    /* renamed from: l */
    private int f322l;

    /* renamed from: m */
    private long f323m;

    /* renamed from: n */
    private long f324n;

    /* renamed from: o */
    private String f325o;

    /* renamed from: a */
    public static final Parcelable.Creator f326a;

    /* loaded from: game-lib.jar:android/view/KeyEvent$Callback.class */
    public interface Callback {
    }

    /* loaded from: game-lib.jar:android/view/KeyEvent$DispatcherState.class */
    public class DispatcherState {

        /* renamed from: a */
        SparseIntArray f327a = new SparseIntArray();
    }

    static {
        m6330b();
        f326a = new Parcelable.Creator() { // from class: android.view.KeyEvent.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public KeyEvent mo6753createFromParcel(Parcel parcel) {
                parcel.readInt();
                return KeyEvent.m6331a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public KeyEvent[] mo6752newArray(int i) {
                return new KeyEvent[i];
            }
        };
    }

    /* renamed from: b */
    private static void m6330b() {
        SparseArray sparseArray = f312b;
        sparseArray.m6335c(0, "KEYCODE_UNKNOWN");
        sparseArray.m6335c(1, "KEYCODE_SOFT_LEFT");
        sparseArray.m6335c(2, "KEYCODE_SOFT_RIGHT");
        sparseArray.m6335c(3, "KEYCODE_HOME");
        sparseArray.m6335c(4, "KEYCODE_BACK");
        sparseArray.m6335c(5, "KEYCODE_CALL");
        sparseArray.m6335c(6, "KEYCODE_ENDCALL");
        sparseArray.m6335c(7, "KEYCODE_0");
        sparseArray.m6335c(8, "KEYCODE_1");
        sparseArray.m6335c(9, "KEYCODE_2");
        sparseArray.m6335c(10, "KEYCODE_3");
        sparseArray.m6335c(11, "KEYCODE_4");
        sparseArray.m6335c(12, "KEYCODE_5");
        sparseArray.m6335c(13, "KEYCODE_6");
        sparseArray.m6335c(14, "KEYCODE_7");
        sparseArray.m6335c(15, "KEYCODE_8");
        sparseArray.m6335c(16, "KEYCODE_9");
        sparseArray.m6335c(17, "KEYCODE_STAR");
        sparseArray.m6335c(18, "KEYCODE_POUND");
        sparseArray.m6335c(19, "KEYCODE_DPAD_UP");
        sparseArray.m6335c(20, "KEYCODE_DPAD_DOWN");
        sparseArray.m6335c(21, "KEYCODE_DPAD_LEFT");
        sparseArray.m6335c(22, "KEYCODE_DPAD_RIGHT");
        sparseArray.m6335c(23, "KEYCODE_DPAD_CENTER");
        sparseArray.m6335c(24, "KEYCODE_VOLUME_UP");
        sparseArray.m6335c(25, "KEYCODE_VOLUME_DOWN");
        sparseArray.m6335c(26, "KEYCODE_POWER");
        sparseArray.m6335c(27, "KEYCODE_CAMERA");
        sparseArray.m6335c(28, "KEYCODE_CLEAR");
        sparseArray.m6335c(29, "KEYCODE_A");
        sparseArray.m6335c(30, "KEYCODE_B");
        sparseArray.m6335c(31, "KEYCODE_C");
        sparseArray.m6335c(32, "KEYCODE_D");
        sparseArray.m6335c(33, "KEYCODE_E");
        sparseArray.m6335c(34, "KEYCODE_F");
        sparseArray.m6335c(35, "KEYCODE_G");
        sparseArray.m6335c(36, "KEYCODE_H");
        sparseArray.m6335c(37, "KEYCODE_I");
        sparseArray.m6335c(38, "KEYCODE_J");
        sparseArray.m6335c(39, "KEYCODE_K");
        sparseArray.m6335c(40, "KEYCODE_L");
        sparseArray.m6335c(41, "KEYCODE_M");
        sparseArray.m6335c(42, "KEYCODE_N");
        sparseArray.m6335c(43, "KEYCODE_O");
        sparseArray.m6335c(44, "KEYCODE_P");
        sparseArray.m6335c(45, "KEYCODE_Q");
        sparseArray.m6335c(46, "KEYCODE_R");
        sparseArray.m6335c(47, "KEYCODE_S");
        sparseArray.m6335c(48, "KEYCODE_T");
        sparseArray.m6335c(49, "KEYCODE_U");
        sparseArray.m6335c(50, "KEYCODE_V");
        sparseArray.m6335c(51, "KEYCODE_W");
        sparseArray.m6335c(52, "KEYCODE_X");
        sparseArray.m6335c(53, "KEYCODE_Y");
        sparseArray.m6335c(54, "KEYCODE_Z");
        sparseArray.m6335c(55, "KEYCODE_COMMA");
        sparseArray.m6335c(56, "KEYCODE_PERIOD");
        sparseArray.m6335c(57, "KEYCODE_ALT_LEFT");
        sparseArray.m6335c(58, "KEYCODE_ALT_RIGHT");
        sparseArray.m6335c(59, "KEYCODE_SHIFT_LEFT");
        sparseArray.m6335c(60, "KEYCODE_SHIFT_RIGHT");
        sparseArray.m6335c(61, "KEYCODE_TAB");
        sparseArray.m6335c(62, "KEYCODE_SPACE");
        sparseArray.m6335c(63, "KEYCODE_SYM");
        sparseArray.m6335c(64, "KEYCODE_EXPLORER");
        sparseArray.m6335c(65, "KEYCODE_ENVELOPE");
        sparseArray.m6335c(66, "KEYCODE_ENTER");
        sparseArray.m6335c(67, "KEYCODE_DEL");
        sparseArray.m6335c(68, "KEYCODE_GRAVE");
        sparseArray.m6335c(69, "KEYCODE_MINUS");
        sparseArray.m6335c(70, "KEYCODE_EQUALS");
        sparseArray.m6335c(71, "KEYCODE_LEFT_BRACKET");
        sparseArray.m6335c(72, "KEYCODE_RIGHT_BRACKET");
        sparseArray.m6335c(73, "KEYCODE_BACKSLASH");
        sparseArray.m6335c(74, "KEYCODE_SEMICOLON");
        sparseArray.m6335c(75, "KEYCODE_APOSTROPHE");
        sparseArray.m6335c(76, "KEYCODE_SLASH");
        sparseArray.m6335c(77, "KEYCODE_AT");
        sparseArray.m6335c(78, "KEYCODE_NUM");
        sparseArray.m6335c(79, "KEYCODE_HEADSETHOOK");
        sparseArray.m6335c(80, "KEYCODE_FOCUS");
        sparseArray.m6335c(81, "KEYCODE_PLUS");
        sparseArray.m6335c(82, "KEYCODE_MENU");
        sparseArray.m6335c(83, "KEYCODE_NOTIFICATION");
        sparseArray.m6335c(84, "KEYCODE_SEARCH");
        sparseArray.m6335c(85, "KEYCODE_MEDIA_PLAY_PAUSE");
        sparseArray.m6335c(86, "KEYCODE_MEDIA_STOP");
        sparseArray.m6335c(87, "KEYCODE_MEDIA_NEXT");
        sparseArray.m6335c(88, "KEYCODE_MEDIA_PREVIOUS");
        sparseArray.m6335c(89, "KEYCODE_MEDIA_REWIND");
        sparseArray.m6335c(90, "KEYCODE_MEDIA_FAST_FORWARD");
        sparseArray.m6335c(91, "KEYCODE_MUTE");
        sparseArray.m6335c(92, "KEYCODE_PAGE_UP");
        sparseArray.m6335c(93, "KEYCODE_PAGE_DOWN");
        sparseArray.m6335c(94, "KEYCODE_PICTSYMBOLS");
        sparseArray.m6335c(95, "KEYCODE_SWITCH_CHARSET");
        sparseArray.m6335c(96, "KEYCODE_BUTTON_A");
        sparseArray.m6335c(97, "KEYCODE_BUTTON_B");
        sparseArray.m6335c(98, "KEYCODE_BUTTON_C");
        sparseArray.m6335c(99, "KEYCODE_BUTTON_X");
        sparseArray.m6335c(100, "KEYCODE_BUTTON_Y");
        sparseArray.m6335c(101, "KEYCODE_BUTTON_Z");
        sparseArray.m6335c(102, "KEYCODE_BUTTON_L1");
        sparseArray.m6335c(103, "KEYCODE_BUTTON_R1");
        sparseArray.m6335c(104, "KEYCODE_BUTTON_L2");
        sparseArray.m6335c(105, "KEYCODE_BUTTON_R2");
        sparseArray.m6335c(106, "KEYCODE_BUTTON_THUMBL");
        sparseArray.m6335c(107, "KEYCODE_BUTTON_THUMBR");
        sparseArray.m6335c(108, "KEYCODE_BUTTON_START");
        sparseArray.m6335c(109, "KEYCODE_BUTTON_SELECT");
        sparseArray.m6335c(110, "KEYCODE_BUTTON_MODE");
        sparseArray.m6335c(111, "KEYCODE_ESCAPE");
        sparseArray.m6335c(112, "KEYCODE_FORWARD_DEL");
        sparseArray.m6335c(113, "KEYCODE_CTRL_LEFT");
        sparseArray.m6335c(114, "KEYCODE_CTRL_RIGHT");
        sparseArray.m6335c(115, "KEYCODE_CAPS_LOCK");
        sparseArray.m6335c(116, "KEYCODE_SCROLL_LOCK");
        sparseArray.m6335c(117, "KEYCODE_META_LEFT");
        sparseArray.m6335c(118, "KEYCODE_META_RIGHT");
        sparseArray.m6335c(119, "KEYCODE_FUNCTION");
        sparseArray.m6335c(120, "KEYCODE_SYSRQ");
        sparseArray.m6335c(121, "KEYCODE_BREAK");
        sparseArray.m6335c(122, "KEYCODE_MOVE_HOME");
        sparseArray.m6335c(123, "KEYCODE_MOVE_END");
        sparseArray.m6335c(124, "KEYCODE_INSERT");
        sparseArray.m6335c(125, "KEYCODE_FORWARD");
        sparseArray.m6335c(126, "KEYCODE_MEDIA_PLAY");
        sparseArray.m6335c(127, "KEYCODE_MEDIA_PAUSE");
        sparseArray.m6335c(128, "KEYCODE_MEDIA_CLOSE");
        sparseArray.m6335c(129, "KEYCODE_MEDIA_EJECT");
        sparseArray.m6335c(130, "KEYCODE_MEDIA_RECORD");
        sparseArray.m6335c(131, "KEYCODE_F1");
        sparseArray.m6335c(132, "KEYCODE_F2");
        sparseArray.m6335c(133, "KEYCODE_F3");
        sparseArray.m6335c(134, "KEYCODE_F4");
        sparseArray.m6335c(135, "KEYCODE_F5");
        sparseArray.m6335c(136, "KEYCODE_F6");
        sparseArray.m6335c(137, "KEYCODE_F7");
        sparseArray.m6335c(138, "KEYCODE_F8");
        sparseArray.m6335c(139, "KEYCODE_F9");
        sparseArray.m6335c(140, "KEYCODE_F10");
        sparseArray.m6335c(141, "KEYCODE_F11");
        sparseArray.m6335c(142, "KEYCODE_F12");
        sparseArray.m6335c(143, "KEYCODE_NUM_LOCK");
        sparseArray.m6335c(144, "KEYCODE_NUMPAD_0");
        sparseArray.m6335c(145, "KEYCODE_NUMPAD_1");
        sparseArray.m6335c(146, "KEYCODE_NUMPAD_2");
        sparseArray.m6335c(147, "KEYCODE_NUMPAD_3");
        sparseArray.m6335c(148, "KEYCODE_NUMPAD_4");
        sparseArray.m6335c(149, "KEYCODE_NUMPAD_5");
        sparseArray.m6335c(150, "KEYCODE_NUMPAD_6");
        sparseArray.m6335c(151, "KEYCODE_NUMPAD_7");
        sparseArray.m6335c(152, "KEYCODE_NUMPAD_8");
        sparseArray.m6335c(153, "KEYCODE_NUMPAD_9");
        sparseArray.m6335c(154, "KEYCODE_NUMPAD_DIVIDE");
        sparseArray.m6335c(155, "KEYCODE_NUMPAD_MULTIPLY");
        sparseArray.m6335c(156, "KEYCODE_NUMPAD_SUBTRACT");
        sparseArray.m6335c(157, "KEYCODE_NUMPAD_ADD");
        sparseArray.m6335c(158, "KEYCODE_NUMPAD_DOT");
        sparseArray.m6335c(159, "KEYCODE_NUMPAD_COMMA");
        sparseArray.m6335c(160, "KEYCODE_NUMPAD_ENTER");
        sparseArray.m6335c(161, "KEYCODE_NUMPAD_EQUALS");
        sparseArray.m6335c(162, "KEYCODE_NUMPAD_LEFT_PAREN");
        sparseArray.m6335c(163, "KEYCODE_NUMPAD_RIGHT_PAREN");
        sparseArray.m6335c(164, "KEYCODE_VOLUME_MUTE");
        sparseArray.m6335c(165, "KEYCODE_INFO");
        sparseArray.m6335c(166, "KEYCODE_CHANNEL_UP");
        sparseArray.m6335c(167, "KEYCODE_CHANNEL_DOWN");
        sparseArray.m6335c(168, "KEYCODE_ZOOM_IN");
        sparseArray.m6335c(169, "KEYCODE_ZOOM_OUT");
        sparseArray.m6335c(170, "KEYCODE_TV");
        sparseArray.m6335c(171, "KEYCODE_WINDOW");
        sparseArray.m6335c(172, "KEYCODE_GUIDE");
        sparseArray.m6335c(173, "KEYCODE_DVR");
        sparseArray.m6335c(174, "KEYCODE_BOOKMARK");
        sparseArray.m6335c(175, "KEYCODE_CAPTIONS");
        sparseArray.m6335c(176, "KEYCODE_SETTINGS");
        sparseArray.m6335c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_POWER, "KEYCODE_TV_POWER");
        sparseArray.m6335c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_INPUT, "KEYCODE_TV_INPUT");
        sparseArray.m6335c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, "KEYCODE_STB_INPUT");
        sparseArray.m6335c(179, "KEYCODE_STB_POWER");
        sparseArray.m6335c(181, "KEYCODE_AVR_POWER");
        sparseArray.m6335c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_AVR_INPUT, "KEYCODE_AVR_INPUT");
        sparseArray.m6335c(183, "KEYCODE_PROG_RED");
        sparseArray.m6335c(184, "KEYCODE_PROG_GREEN");
        sparseArray.m6335c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_YELLOW, "KEYCODE_PROG_YELLOW");
        sparseArray.m6335c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_BLUE, "KEYCODE_PROG_BLUE");
        sparseArray.m6335c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_APP_SWITCH, "KEYCODE_APP_SWITCH");
        sparseArray.m6335c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_1, "KEYCODE_BUTTON_1");
        sparseArray.m6335c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_2, "KEYCODE_BUTTON_2");
        sparseArray.m6335c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, "KEYCODE_BUTTON_3");
        sparseArray.m6335c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_4, "KEYCODE_BUTTON_4");
        sparseArray.m6335c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_5, "KEYCODE_BUTTON_5");
        sparseArray.m6335c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_6, "KEYCODE_BUTTON_6");
        sparseArray.m6335c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_7, "KEYCODE_BUTTON_7");
        sparseArray.m6335c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8, "KEYCODE_BUTTON_8");
        sparseArray.m6335c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_9, "KEYCODE_BUTTON_9");
        sparseArray.m6335c(197, "KEYCODE_BUTTON_10");
        sparseArray.m6335c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_11, "KEYCODE_BUTTON_11");
        sparseArray.m6335c(199, "KEYCODE_BUTTON_12");
        sparseArray.m6335c(200, "KEYCODE_BUTTON_13");
        sparseArray.m6335c(201, "KEYCODE_BUTTON_14");
        sparseArray.m6335c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_15, "KEYCODE_BUTTON_15");
        sparseArray.m6335c(203, "KEYCODE_BUTTON_16");
        sparseArray.m6335c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_LANGUAGE_SWITCH, "KEYCODE_LANGUAGE_SWITCH");
        sparseArray.m6335c(205, "KEYCODE_MANNER_MODE");
        sparseArray.m6335c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_3D_MODE, "KEYCODE_3D_MODE");
        sparseArray.m6335c(207, "KEYCODE_CONTACTS");
        sparseArray.m6335c(208, "KEYCODE_CALENDAR");
        sparseArray.m6335c(209, "KEYCODE_MUSIC");
        sparseArray.m6335c(210, "KEYCODE_CALCULATOR");
        sparseArray.m6335c(211, "KEYCODE_ZENKAKU_HANKAKU");
        sparseArray.m6335c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_EISU, "KEYCODE_EISU");
        sparseArray.m6335c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_MUHENKAN, "KEYCODE_MUHENKAN");
        sparseArray.m6335c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_HENKAN, "KEYCODE_HENKAN");
        sparseArray.m6335c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_KATAKANA_HIRAGANA, "KEYCODE_KATAKANA_HIRAGANA");
        sparseArray.m6335c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_YEN, "KEYCODE_YEN");
        sparseArray.m6335c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_RO, "KEYCODE_RO");
        sparseArray.m6335c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_KANA, "KEYCODE_KANA");
        sparseArray.m6335c(219, "KEYCODE_ASSIST");
        sparseArray.m6335c(220, "KEYCODE_BRIGHTNESS_DOWN");
        sparseArray.m6335c(221, "KEYCODE_BRIGHTNESS_UP");
        sparseArray.m6335c(222, "KEYCODE_MEDIA_AUDIO_TRACK");
    }

    /* renamed from: a */
    public static int m6333a() {
        return 222;
    }

    private KeyEvent() {
    }

    @Override // android.view.InputEvent
    public final int getDeviceId() {
        return this.f315e;
    }

    @Override // android.view.InputEvent
    public final int getSource() {
        return this.f316f;
    }

    @Override // android.view.InputEvent
    public final long getEventTime() {
        return this.f324n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyEvent { action=").append(m6332a(this.f318h));
        sb.append(", keyCode=").append(m6329b(this.f319i));
        sb.append(", scanCode=").append(this.f320j);
        if (this.f325o != null) {
            sb.append(", characters=\"").append(this.f325o).append("\"");
        }
        sb.append(", metaState=").append(m6328c(this.f317g));
        sb.append(", flags=0x").append(Integer.toHexString(this.f322l));
        sb.append(", repeatCount=").append(this.f321k);
        sb.append(", eventTime=").append(this.f324n);
        sb.append(", downTime=").append(this.f323m);
        sb.append(", deviceId=").append(this.f315e);
        sb.append(", source=0x").append(Integer.toHexString(this.f316f));
        sb.append(" }");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m6332a(int i) {
        switch (i) {
            case 0:
                return "ACTION_DOWN";
            case 1:
                return "ACTION_UP";
            case 2:
                return "ACTION_MULTIPLE";
            default:
                return Integer.toString(i);
        }
    }

    /* renamed from: b */
    public static String m6329b(int i) {
        String str = (String) f312b.m6342a(i);
        return str != null ? str : Integer.toString(i);
    }

    /* renamed from: c */
    public static String m6328c(int i) {
        if (i == 0) {
            return "0";
        }
        StringBuilder sb = null;
        int i2 = 0;
        while (i != 0) {
            boolean z = (i & 1) != 0;
            i >>>= 1;
            if (z) {
                String str = f313c[i2];
                if (sb == null) {
                    if (i == 0) {
                        return str;
                    }
                    sb = new StringBuilder(str);
                } else {
                    sb.append('|');
                    sb.append(str);
                }
            }
            i2++;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static KeyEvent m6331a(Parcel parcel) {
        return new KeyEvent(parcel);
    }

    private KeyEvent(Parcel parcel) {
        this.f315e = parcel.readInt();
        this.f316f = parcel.readInt();
        this.f318h = parcel.readInt();
        this.f319i = parcel.readInt();
        this.f321k = parcel.readInt();
        this.f317g = parcel.readInt();
        this.f320j = parcel.readInt();
        this.f322l = parcel.readInt();
        this.f323m = parcel.readLong();
        this.f324n = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f315e);
        parcel.writeInt(this.f316f);
        parcel.writeInt(this.f318h);
        parcel.writeInt(this.f319i);
        parcel.writeInt(this.f321k);
        parcel.writeInt(this.f317g);
        parcel.writeInt(this.f320j);
        parcel.writeInt(this.f322l);
        parcel.writeLong(this.f323m);
        parcel.writeLong(this.f324n);
    }
}
