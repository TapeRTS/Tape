package android.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* loaded from: game-lib.jar:android/view/KeyEvent.class */
public class KeyEvent extends InputEvent implements Parcelable {

    /* renamed from: e */
    private int f312e;

    /* renamed from: f */
    private int f313f;

    /* renamed from: g */
    private int f314g;

    /* renamed from: h */
    private int f315h;

    /* renamed from: i */
    private int f316i;

    /* renamed from: j */
    private int f317j;

    /* renamed from: k */
    private int f318k;

    /* renamed from: l */
    private int f319l;

    /* renamed from: m */
    private long f320m;

    /* renamed from: n */
    private long f321n;

    /* renamed from: o */
    private String f322o;

    /* renamed from: b */
    private static final SparseArray f309b = new SparseArray();

    /* renamed from: c */
    private static final String[] f310c = {"META_SHIFT_ON", "META_ALT_ON", "META_SYM_ON", "META_FUNCTION_ON", "META_ALT_LEFT_ON", "META_ALT_RIGHT_ON", "META_SHIFT_LEFT_ON", "META_SHIFT_RIGHT_ON", "META_CAP_LOCKED", "META_ALT_LOCKED", "META_SYM_LOCKED", "0x00000800", "META_CTRL_ON", "META_CTRL_LEFT_ON", "META_CTRL_RIGHT_ON", "0x00008000", "META_META_ON", "META_META_LEFT_ON", "META_META_RIGHT_ON", "0x00080000", "META_CAPS_LOCK_ON", "META_NUM_LOCK_ON", "META_SCROLL_LOCK_ON", "0x00800000", "0x01000000", "0x02000000", "0x04000000", "0x08000000", "0x10000000", "0x20000000", "0x40000000", "0x80000000"};

    /* renamed from: d */
    private static final Object f311d = new Object();

    /* renamed from: a */
    public static final Parcelable.Creator f323a = new Parcelable.Creator() { // from class: android.view.KeyEvent.1
        /* renamed from: a */
        public KeyEvent createFromParcel(Parcel parcel) {
            parcel.readInt();
            return KeyEvent.m4019a(parcel);
        }

        /* renamed from: a */
        public KeyEvent[] newArray(int i) {
            return new KeyEvent[i];
        }
    };

    /* loaded from: game-lib.jar:android/view/KeyEvent$Callback.class */
    public interface Callback {
    }

    /* loaded from: game-lib.jar:android/view/KeyEvent$DispatcherState.class */
    public class DispatcherState {

        /* renamed from: a */
        SparseIntArray f324a = new SparseIntArray();
    }

    static {
        m4018b();
    }

    /* renamed from: b */
    private static void m4018b() {
        SparseArray sparseArray = f309b;
        sparseArray.m4023c(0, "KEYCODE_UNKNOWN");
        sparseArray.m4023c(1, "KEYCODE_SOFT_LEFT");
        sparseArray.m4023c(2, "KEYCODE_SOFT_RIGHT");
        sparseArray.m4023c(3, "KEYCODE_HOME");
        sparseArray.m4023c(4, "KEYCODE_BACK");
        sparseArray.m4023c(5, "KEYCODE_CALL");
        sparseArray.m4023c(6, "KEYCODE_ENDCALL");
        sparseArray.m4023c(7, "KEYCODE_0");
        sparseArray.m4023c(8, "KEYCODE_1");
        sparseArray.m4023c(9, "KEYCODE_2");
        sparseArray.m4023c(10, "KEYCODE_3");
        sparseArray.m4023c(11, "KEYCODE_4");
        sparseArray.m4023c(12, "KEYCODE_5");
        sparseArray.m4023c(13, "KEYCODE_6");
        sparseArray.m4023c(14, "KEYCODE_7");
        sparseArray.m4023c(15, "KEYCODE_8");
        sparseArray.m4023c(16, "KEYCODE_9");
        sparseArray.m4023c(17, "KEYCODE_STAR");
        sparseArray.m4023c(18, "KEYCODE_POUND");
        sparseArray.m4023c(19, "KEYCODE_DPAD_UP");
        sparseArray.m4023c(20, "KEYCODE_DPAD_DOWN");
        sparseArray.m4023c(21, "KEYCODE_DPAD_LEFT");
        sparseArray.m4023c(22, "KEYCODE_DPAD_RIGHT");
        sparseArray.m4023c(23, "KEYCODE_DPAD_CENTER");
        sparseArray.m4023c(24, "KEYCODE_VOLUME_UP");
        sparseArray.m4023c(25, "KEYCODE_VOLUME_DOWN");
        sparseArray.m4023c(26, "KEYCODE_POWER");
        sparseArray.m4023c(27, "KEYCODE_CAMERA");
        sparseArray.m4023c(28, "KEYCODE_CLEAR");
        sparseArray.m4023c(29, "KEYCODE_A");
        sparseArray.m4023c(30, "KEYCODE_B");
        sparseArray.m4023c(31, "KEYCODE_C");
        sparseArray.m4023c(32, "KEYCODE_D");
        sparseArray.m4023c(33, "KEYCODE_E");
        sparseArray.m4023c(34, "KEYCODE_F");
        sparseArray.m4023c(35, "KEYCODE_G");
        sparseArray.m4023c(36, "KEYCODE_H");
        sparseArray.m4023c(37, "KEYCODE_I");
        sparseArray.m4023c(38, "KEYCODE_J");
        sparseArray.m4023c(39, "KEYCODE_K");
        sparseArray.m4023c(40, "KEYCODE_L");
        sparseArray.m4023c(41, "KEYCODE_M");
        sparseArray.m4023c(42, "KEYCODE_N");
        sparseArray.m4023c(43, "KEYCODE_O");
        sparseArray.m4023c(44, "KEYCODE_P");
        sparseArray.m4023c(45, "KEYCODE_Q");
        sparseArray.m4023c(46, "KEYCODE_R");
        sparseArray.m4023c(47, "KEYCODE_S");
        sparseArray.m4023c(48, "KEYCODE_T");
        sparseArray.m4023c(49, "KEYCODE_U");
        sparseArray.m4023c(50, "KEYCODE_V");
        sparseArray.m4023c(51, "KEYCODE_W");
        sparseArray.m4023c(52, "KEYCODE_X");
        sparseArray.m4023c(53, "KEYCODE_Y");
        sparseArray.m4023c(54, "KEYCODE_Z");
        sparseArray.m4023c(55, "KEYCODE_COMMA");
        sparseArray.m4023c(56, "KEYCODE_PERIOD");
        sparseArray.m4023c(57, "KEYCODE_ALT_LEFT");
        sparseArray.m4023c(58, "KEYCODE_ALT_RIGHT");
        sparseArray.m4023c(59, "KEYCODE_SHIFT_LEFT");
        sparseArray.m4023c(60, "KEYCODE_SHIFT_RIGHT");
        sparseArray.m4023c(61, "KEYCODE_TAB");
        sparseArray.m4023c(62, "KEYCODE_SPACE");
        sparseArray.m4023c(63, "KEYCODE_SYM");
        sparseArray.m4023c(64, "KEYCODE_EXPLORER");
        sparseArray.m4023c(65, "KEYCODE_ENVELOPE");
        sparseArray.m4023c(66, "KEYCODE_ENTER");
        sparseArray.m4023c(67, "KEYCODE_DEL");
        sparseArray.m4023c(68, "KEYCODE_GRAVE");
        sparseArray.m4023c(69, "KEYCODE_MINUS");
        sparseArray.m4023c(70, "KEYCODE_EQUALS");
        sparseArray.m4023c(71, "KEYCODE_LEFT_BRACKET");
        sparseArray.m4023c(72, "KEYCODE_RIGHT_BRACKET");
        sparseArray.m4023c(73, "KEYCODE_BACKSLASH");
        sparseArray.m4023c(74, "KEYCODE_SEMICOLON");
        sparseArray.m4023c(75, "KEYCODE_APOSTROPHE");
        sparseArray.m4023c(76, "KEYCODE_SLASH");
        sparseArray.m4023c(77, "KEYCODE_AT");
        sparseArray.m4023c(78, "KEYCODE_NUM");
        sparseArray.m4023c(79, "KEYCODE_HEADSETHOOK");
        sparseArray.m4023c(80, "KEYCODE_FOCUS");
        sparseArray.m4023c(81, "KEYCODE_PLUS");
        sparseArray.m4023c(82, "KEYCODE_MENU");
        sparseArray.m4023c(83, "KEYCODE_NOTIFICATION");
        sparseArray.m4023c(84, "KEYCODE_SEARCH");
        sparseArray.m4023c(85, "KEYCODE_MEDIA_PLAY_PAUSE");
        sparseArray.m4023c(86, "KEYCODE_MEDIA_STOP");
        sparseArray.m4023c(87, "KEYCODE_MEDIA_NEXT");
        sparseArray.m4023c(88, "KEYCODE_MEDIA_PREVIOUS");
        sparseArray.m4023c(89, "KEYCODE_MEDIA_REWIND");
        sparseArray.m4023c(90, "KEYCODE_MEDIA_FAST_FORWARD");
        sparseArray.m4023c(91, "KEYCODE_MUTE");
        sparseArray.m4023c(92, "KEYCODE_PAGE_UP");
        sparseArray.m4023c(93, "KEYCODE_PAGE_DOWN");
        sparseArray.m4023c(94, "KEYCODE_PICTSYMBOLS");
        sparseArray.m4023c(95, "KEYCODE_SWITCH_CHARSET");
        sparseArray.m4023c(96, "KEYCODE_BUTTON_A");
        sparseArray.m4023c(97, "KEYCODE_BUTTON_B");
        sparseArray.m4023c(98, "KEYCODE_BUTTON_C");
        sparseArray.m4023c(99, "KEYCODE_BUTTON_X");
        sparseArray.m4023c(100, "KEYCODE_BUTTON_Y");
        sparseArray.m4023c(101, "KEYCODE_BUTTON_Z");
        sparseArray.m4023c(102, "KEYCODE_BUTTON_L1");
        sparseArray.m4023c(103, "KEYCODE_BUTTON_R1");
        sparseArray.m4023c(104, "KEYCODE_BUTTON_L2");
        sparseArray.m4023c(105, "KEYCODE_BUTTON_R2");
        sparseArray.m4023c(106, "KEYCODE_BUTTON_THUMBL");
        sparseArray.m4023c(107, "KEYCODE_BUTTON_THUMBR");
        sparseArray.m4023c(108, "KEYCODE_BUTTON_START");
        sparseArray.m4023c(109, "KEYCODE_BUTTON_SELECT");
        sparseArray.m4023c(110, "KEYCODE_BUTTON_MODE");
        sparseArray.m4023c(111, "KEYCODE_ESCAPE");
        sparseArray.m4023c(112, "KEYCODE_FORWARD_DEL");
        sparseArray.m4023c(113, "KEYCODE_CTRL_LEFT");
        sparseArray.m4023c(114, "KEYCODE_CTRL_RIGHT");
        sparseArray.m4023c(115, "KEYCODE_CAPS_LOCK");
        sparseArray.m4023c(116, "KEYCODE_SCROLL_LOCK");
        sparseArray.m4023c(117, "KEYCODE_META_LEFT");
        sparseArray.m4023c(118, "KEYCODE_META_RIGHT");
        sparseArray.m4023c(119, "KEYCODE_FUNCTION");
        sparseArray.m4023c(120, "KEYCODE_SYSRQ");
        sparseArray.m4023c(121, "KEYCODE_BREAK");
        sparseArray.m4023c(122, "KEYCODE_MOVE_HOME");
        sparseArray.m4023c(123, "KEYCODE_MOVE_END");
        sparseArray.m4023c(124, "KEYCODE_INSERT");
        sparseArray.m4023c(125, "KEYCODE_FORWARD");
        sparseArray.m4023c(126, "KEYCODE_MEDIA_PLAY");
        sparseArray.m4023c(127, "KEYCODE_MEDIA_PAUSE");
        sparseArray.m4023c(128, "KEYCODE_MEDIA_CLOSE");
        sparseArray.m4023c(129, "KEYCODE_MEDIA_EJECT");
        sparseArray.m4023c(130, "KEYCODE_MEDIA_RECORD");
        sparseArray.m4023c(131, "KEYCODE_F1");
        sparseArray.m4023c(132, "KEYCODE_F2");
        sparseArray.m4023c(133, "KEYCODE_F3");
        sparseArray.m4023c(134, "KEYCODE_F4");
        sparseArray.m4023c(135, "KEYCODE_F5");
        sparseArray.m4023c(136, "KEYCODE_F6");
        sparseArray.m4023c(137, "KEYCODE_F7");
        sparseArray.m4023c(138, "KEYCODE_F8");
        sparseArray.m4023c(139, "KEYCODE_F9");
        sparseArray.m4023c(140, "KEYCODE_F10");
        sparseArray.m4023c(141, "KEYCODE_F11");
        sparseArray.m4023c(142, "KEYCODE_F12");
        sparseArray.m4023c(143, "KEYCODE_NUM_LOCK");
        sparseArray.m4023c(144, "KEYCODE_NUMPAD_0");
        sparseArray.m4023c(145, "KEYCODE_NUMPAD_1");
        sparseArray.m4023c(146, "KEYCODE_NUMPAD_2");
        sparseArray.m4023c(147, "KEYCODE_NUMPAD_3");
        sparseArray.m4023c(148, "KEYCODE_NUMPAD_4");
        sparseArray.m4023c(149, "KEYCODE_NUMPAD_5");
        sparseArray.m4023c(150, "KEYCODE_NUMPAD_6");
        sparseArray.m4023c(151, "KEYCODE_NUMPAD_7");
        sparseArray.m4023c(152, "KEYCODE_NUMPAD_8");
        sparseArray.m4023c(153, "KEYCODE_NUMPAD_9");
        sparseArray.m4023c(154, "KEYCODE_NUMPAD_DIVIDE");
        sparseArray.m4023c(155, "KEYCODE_NUMPAD_MULTIPLY");
        sparseArray.m4023c(156, "KEYCODE_NUMPAD_SUBTRACT");
        sparseArray.m4023c(157, "KEYCODE_NUMPAD_ADD");
        sparseArray.m4023c(158, "KEYCODE_NUMPAD_DOT");
        sparseArray.m4023c(159, "KEYCODE_NUMPAD_COMMA");
        sparseArray.m4023c(160, "KEYCODE_NUMPAD_ENTER");
        sparseArray.m4023c(161, "KEYCODE_NUMPAD_EQUALS");
        sparseArray.m4023c(162, "KEYCODE_NUMPAD_LEFT_PAREN");
        sparseArray.m4023c(163, "KEYCODE_NUMPAD_RIGHT_PAREN");
        sparseArray.m4023c(164, "KEYCODE_VOLUME_MUTE");
        sparseArray.m4023c(165, "KEYCODE_INFO");
        sparseArray.m4023c(166, "KEYCODE_CHANNEL_UP");
        sparseArray.m4023c(167, "KEYCODE_CHANNEL_DOWN");
        sparseArray.m4023c(168, "KEYCODE_ZOOM_IN");
        sparseArray.m4023c(169, "KEYCODE_ZOOM_OUT");
        sparseArray.m4023c(170, "KEYCODE_TV");
        sparseArray.m4023c(171, "KEYCODE_WINDOW");
        sparseArray.m4023c(172, "KEYCODE_GUIDE");
        sparseArray.m4023c(173, "KEYCODE_DVR");
        sparseArray.m4023c(174, "KEYCODE_BOOKMARK");
        sparseArray.m4023c(175, "KEYCODE_CAPTIONS");
        sparseArray.m4023c(176, "KEYCODE_SETTINGS");
        sparseArray.m4023c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_POWER, "KEYCODE_TV_POWER");
        sparseArray.m4023c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_INPUT, "KEYCODE_TV_INPUT");
        sparseArray.m4023c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, "KEYCODE_STB_INPUT");
        sparseArray.m4023c(179, "KEYCODE_STB_POWER");
        sparseArray.m4023c(181, "KEYCODE_AVR_POWER");
        sparseArray.m4023c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_AVR_INPUT, "KEYCODE_AVR_INPUT");
        sparseArray.m4023c(183, "KEYCODE_PROG_RED");
        sparseArray.m4023c(184, "KEYCODE_PROG_GREEN");
        sparseArray.m4023c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_YELLOW, "KEYCODE_PROG_YELLOW");
        sparseArray.m4023c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_BLUE, "KEYCODE_PROG_BLUE");
        sparseArray.m4023c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_APP_SWITCH, "KEYCODE_APP_SWITCH");
        sparseArray.m4023c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_1, "KEYCODE_BUTTON_1");
        sparseArray.m4023c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_2, "KEYCODE_BUTTON_2");
        sparseArray.m4023c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, "KEYCODE_BUTTON_3");
        sparseArray.m4023c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_4, "KEYCODE_BUTTON_4");
        sparseArray.m4023c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_5, "KEYCODE_BUTTON_5");
        sparseArray.m4023c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_6, "KEYCODE_BUTTON_6");
        sparseArray.m4023c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_7, "KEYCODE_BUTTON_7");
        sparseArray.m4023c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8, "KEYCODE_BUTTON_8");
        sparseArray.m4023c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_9, "KEYCODE_BUTTON_9");
        sparseArray.m4023c(197, "KEYCODE_BUTTON_10");
        sparseArray.m4023c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_11, "KEYCODE_BUTTON_11");
        sparseArray.m4023c(199, "KEYCODE_BUTTON_12");
        sparseArray.m4023c(200, "KEYCODE_BUTTON_13");
        sparseArray.m4023c(201, "KEYCODE_BUTTON_14");
        sparseArray.m4023c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_15, "KEYCODE_BUTTON_15");
        sparseArray.m4023c(203, "KEYCODE_BUTTON_16");
        sparseArray.m4023c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_LANGUAGE_SWITCH, "KEYCODE_LANGUAGE_SWITCH");
        sparseArray.m4023c(205, "KEYCODE_MANNER_MODE");
        sparseArray.m4023c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_3D_MODE, "KEYCODE_3D_MODE");
        sparseArray.m4023c(207, "KEYCODE_CONTACTS");
        sparseArray.m4023c(208, "KEYCODE_CALENDAR");
        sparseArray.m4023c(209, "KEYCODE_MUSIC");
        sparseArray.m4023c(210, "KEYCODE_CALCULATOR");
        sparseArray.m4023c(211, "KEYCODE_ZENKAKU_HANKAKU");
        sparseArray.m4023c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_EISU, "KEYCODE_EISU");
        sparseArray.m4023c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_MUHENKAN, "KEYCODE_MUHENKAN");
        sparseArray.m4023c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_HENKAN, "KEYCODE_HENKAN");
        sparseArray.m4023c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_KATAKANA_HIRAGANA, "KEYCODE_KATAKANA_HIRAGANA");
        sparseArray.m4023c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_YEN, "KEYCODE_YEN");
        sparseArray.m4023c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_RO, "KEYCODE_RO");
        sparseArray.m4023c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_KANA, "KEYCODE_KANA");
        sparseArray.m4023c(219, "KEYCODE_ASSIST");
        sparseArray.m4023c(220, "KEYCODE_BRIGHTNESS_DOWN");
        sparseArray.m4023c(221, "KEYCODE_BRIGHTNESS_UP");
        sparseArray.m4023c(222, "KEYCODE_MEDIA_AUDIO_TRACK");
    }

    /* renamed from: a */
    public static int m4021a() {
        return 222;
    }

    private KeyEvent() {
    }

    @Override // android.view.InputEvent
    public final int getDeviceId() {
        return this.f312e;
    }

    @Override // android.view.InputEvent
    public final int getSource() {
        return this.f313f;
    }

    @Override // android.view.InputEvent
    public final long getEventTime() {
        return this.f321n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyEvent { action=").append(m4020a(this.f315h));
        sb.append(", keyCode=").append(m4017b(this.f316i));
        sb.append(", scanCode=").append(this.f317j);
        if (this.f322o != null) {
            sb.append(", characters=\"").append(this.f322o).append("\"");
        }
        sb.append(", metaState=").append(m4016c(this.f314g));
        sb.append(", flags=0x").append(Integer.toHexString(this.f319l));
        sb.append(", repeatCount=").append(this.f318k);
        sb.append(", eventTime=").append(this.f321n);
        sb.append(", downTime=").append(this.f320m);
        sb.append(", deviceId=").append(this.f312e);
        sb.append(", source=0x").append(Integer.toHexString(this.f313f));
        sb.append(" }");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m4020a(int i) {
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
    public static String m4017b(int i) {
        String str = (String) f309b.m4030a(i);
        return str != null ? str : Integer.toString(i);
    }

    /* renamed from: c */
    public static String m4016c(int i) {
        if (i == 0) {
            return "0";
        }
        StringBuilder sb = null;
        int i2 = 0;
        while (i != 0) {
            boolean z = (i & 1) != 0;
            i >>>= 1;
            if (z) {
                String str = f310c[i2];
                if (sb != null) {
                    sb.append('|');
                    sb.append(str);
                } else if (i == 0) {
                    return str;
                } else {
                    sb = new StringBuilder(str);
                }
            }
            i2++;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static KeyEvent m4019a(Parcel parcel) {
        return new KeyEvent(parcel);
    }

    private KeyEvent(Parcel parcel) {
        this.f312e = parcel.readInt();
        this.f313f = parcel.readInt();
        this.f315h = parcel.readInt();
        this.f316i = parcel.readInt();
        this.f318k = parcel.readInt();
        this.f314g = parcel.readInt();
        this.f317j = parcel.readInt();
        this.f319l = parcel.readInt();
        this.f320m = parcel.readLong();
        this.f321n = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f312e);
        parcel.writeInt(this.f313f);
        parcel.writeInt(this.f315h);
        parcel.writeInt(this.f316i);
        parcel.writeInt(this.f318k);
        parcel.writeInt(this.f314g);
        parcel.writeInt(this.f317j);
        parcel.writeInt(this.f319l);
        parcel.writeLong(this.f320m);
        parcel.writeLong(this.f321n);
    }
}
