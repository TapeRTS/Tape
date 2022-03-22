/*      */ package android.view;
/*      */ 
/*      */ import android.os.Parcel;
/*      */ import android.os.Parcelable;
/*      */ import android.util.SparseArray;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class KeyEvent
/*      */   extends InputEvent
/*      */   implements Parcelable
/*      */ {
/*  655 */   private static final SparseArray b = new SparseArray();
/*      */   private static void b() {
/*  657 */     SparseArray sparseArray = b;
/*  658 */     sparseArray.c(0, "KEYCODE_UNKNOWN");
/*  659 */     sparseArray.c(1, "KEYCODE_SOFT_LEFT");
/*  660 */     sparseArray.c(2, "KEYCODE_SOFT_RIGHT");
/*  661 */     sparseArray.c(3, "KEYCODE_HOME");
/*  662 */     sparseArray.c(4, "KEYCODE_BACK");
/*  663 */     sparseArray.c(5, "KEYCODE_CALL");
/*  664 */     sparseArray.c(6, "KEYCODE_ENDCALL");
/*  665 */     sparseArray.c(7, "KEYCODE_0");
/*  666 */     sparseArray.c(8, "KEYCODE_1");
/*  667 */     sparseArray.c(9, "KEYCODE_2");
/*  668 */     sparseArray.c(10, "KEYCODE_3");
/*  669 */     sparseArray.c(11, "KEYCODE_4");
/*  670 */     sparseArray.c(12, "KEYCODE_5");
/*  671 */     sparseArray.c(13, "KEYCODE_6");
/*  672 */     sparseArray.c(14, "KEYCODE_7");
/*  673 */     sparseArray.c(15, "KEYCODE_8");
/*  674 */     sparseArray.c(16, "KEYCODE_9");
/*  675 */     sparseArray.c(17, "KEYCODE_STAR");
/*  676 */     sparseArray.c(18, "KEYCODE_POUND");
/*  677 */     sparseArray.c(19, "KEYCODE_DPAD_UP");
/*  678 */     sparseArray.c(20, "KEYCODE_DPAD_DOWN");
/*  679 */     sparseArray.c(21, "KEYCODE_DPAD_LEFT");
/*  680 */     sparseArray.c(22, "KEYCODE_DPAD_RIGHT");
/*  681 */     sparseArray.c(23, "KEYCODE_DPAD_CENTER");
/*  682 */     sparseArray.c(24, "KEYCODE_VOLUME_UP");
/*  683 */     sparseArray.c(25, "KEYCODE_VOLUME_DOWN");
/*  684 */     sparseArray.c(26, "KEYCODE_POWER");
/*  685 */     sparseArray.c(27, "KEYCODE_CAMERA");
/*  686 */     sparseArray.c(28, "KEYCODE_CLEAR");
/*  687 */     sparseArray.c(29, "KEYCODE_A");
/*  688 */     sparseArray.c(30, "KEYCODE_B");
/*  689 */     sparseArray.c(31, "KEYCODE_C");
/*  690 */     sparseArray.c(32, "KEYCODE_D");
/*  691 */     sparseArray.c(33, "KEYCODE_E");
/*  692 */     sparseArray.c(34, "KEYCODE_F");
/*  693 */     sparseArray.c(35, "KEYCODE_G");
/*  694 */     sparseArray.c(36, "KEYCODE_H");
/*  695 */     sparseArray.c(37, "KEYCODE_I");
/*  696 */     sparseArray.c(38, "KEYCODE_J");
/*  697 */     sparseArray.c(39, "KEYCODE_K");
/*  698 */     sparseArray.c(40, "KEYCODE_L");
/*  699 */     sparseArray.c(41, "KEYCODE_M");
/*  700 */     sparseArray.c(42, "KEYCODE_N");
/*  701 */     sparseArray.c(43, "KEYCODE_O");
/*  702 */     sparseArray.c(44, "KEYCODE_P");
/*  703 */     sparseArray.c(45, "KEYCODE_Q");
/*  704 */     sparseArray.c(46, "KEYCODE_R");
/*  705 */     sparseArray.c(47, "KEYCODE_S");
/*  706 */     sparseArray.c(48, "KEYCODE_T");
/*  707 */     sparseArray.c(49, "KEYCODE_U");
/*  708 */     sparseArray.c(50, "KEYCODE_V");
/*  709 */     sparseArray.c(51, "KEYCODE_W");
/*  710 */     sparseArray.c(52, "KEYCODE_X");
/*  711 */     sparseArray.c(53, "KEYCODE_Y");
/*  712 */     sparseArray.c(54, "KEYCODE_Z");
/*  713 */     sparseArray.c(55, "KEYCODE_COMMA");
/*  714 */     sparseArray.c(56, "KEYCODE_PERIOD");
/*  715 */     sparseArray.c(57, "KEYCODE_ALT_LEFT");
/*  716 */     sparseArray.c(58, "KEYCODE_ALT_RIGHT");
/*  717 */     sparseArray.c(59, "KEYCODE_SHIFT_LEFT");
/*  718 */     sparseArray.c(60, "KEYCODE_SHIFT_RIGHT");
/*  719 */     sparseArray.c(61, "KEYCODE_TAB");
/*  720 */     sparseArray.c(62, "KEYCODE_SPACE");
/*  721 */     sparseArray.c(63, "KEYCODE_SYM");
/*  722 */     sparseArray.c(64, "KEYCODE_EXPLORER");
/*  723 */     sparseArray.c(65, "KEYCODE_ENVELOPE");
/*  724 */     sparseArray.c(66, "KEYCODE_ENTER");
/*  725 */     sparseArray.c(67, "KEYCODE_DEL");
/*  726 */     sparseArray.c(68, "KEYCODE_GRAVE");
/*  727 */     sparseArray.c(69, "KEYCODE_MINUS");
/*  728 */     sparseArray.c(70, "KEYCODE_EQUALS");
/*  729 */     sparseArray.c(71, "KEYCODE_LEFT_BRACKET");
/*  730 */     sparseArray.c(72, "KEYCODE_RIGHT_BRACKET");
/*  731 */     sparseArray.c(73, "KEYCODE_BACKSLASH");
/*  732 */     sparseArray.c(74, "KEYCODE_SEMICOLON");
/*  733 */     sparseArray.c(75, "KEYCODE_APOSTROPHE");
/*  734 */     sparseArray.c(76, "KEYCODE_SLASH");
/*  735 */     sparseArray.c(77, "KEYCODE_AT");
/*  736 */     sparseArray.c(78, "KEYCODE_NUM");
/*  737 */     sparseArray.c(79, "KEYCODE_HEADSETHOOK");
/*  738 */     sparseArray.c(80, "KEYCODE_FOCUS");
/*  739 */     sparseArray.c(81, "KEYCODE_PLUS");
/*  740 */     sparseArray.c(82, "KEYCODE_MENU");
/*  741 */     sparseArray.c(83, "KEYCODE_NOTIFICATION");
/*  742 */     sparseArray.c(84, "KEYCODE_SEARCH");
/*  743 */     sparseArray.c(85, "KEYCODE_MEDIA_PLAY_PAUSE");
/*  744 */     sparseArray.c(86, "KEYCODE_MEDIA_STOP");
/*  745 */     sparseArray.c(87, "KEYCODE_MEDIA_NEXT");
/*  746 */     sparseArray.c(88, "KEYCODE_MEDIA_PREVIOUS");
/*  747 */     sparseArray.c(89, "KEYCODE_MEDIA_REWIND");
/*  748 */     sparseArray.c(90, "KEYCODE_MEDIA_FAST_FORWARD");
/*  749 */     sparseArray.c(91, "KEYCODE_MUTE");
/*  750 */     sparseArray.c(92, "KEYCODE_PAGE_UP");
/*  751 */     sparseArray.c(93, "KEYCODE_PAGE_DOWN");
/*  752 */     sparseArray.c(94, "KEYCODE_PICTSYMBOLS");
/*  753 */     sparseArray.c(95, "KEYCODE_SWITCH_CHARSET");
/*  754 */     sparseArray.c(96, "KEYCODE_BUTTON_A");
/*  755 */     sparseArray.c(97, "KEYCODE_BUTTON_B");
/*  756 */     sparseArray.c(98, "KEYCODE_BUTTON_C");
/*  757 */     sparseArray.c(99, "KEYCODE_BUTTON_X");
/*  758 */     sparseArray.c(100, "KEYCODE_BUTTON_Y");
/*  759 */     sparseArray.c(101, "KEYCODE_BUTTON_Z");
/*  760 */     sparseArray.c(102, "KEYCODE_BUTTON_L1");
/*  761 */     sparseArray.c(103, "KEYCODE_BUTTON_R1");
/*  762 */     sparseArray.c(104, "KEYCODE_BUTTON_L2");
/*  763 */     sparseArray.c(105, "KEYCODE_BUTTON_R2");
/*  764 */     sparseArray.c(106, "KEYCODE_BUTTON_THUMBL");
/*  765 */     sparseArray.c(107, "KEYCODE_BUTTON_THUMBR");
/*  766 */     sparseArray.c(108, "KEYCODE_BUTTON_START");
/*  767 */     sparseArray.c(109, "KEYCODE_BUTTON_SELECT");
/*  768 */     sparseArray.c(110, "KEYCODE_BUTTON_MODE");
/*  769 */     sparseArray.c(111, "KEYCODE_ESCAPE");
/*  770 */     sparseArray.c(112, "KEYCODE_FORWARD_DEL");
/*  771 */     sparseArray.c(113, "KEYCODE_CTRL_LEFT");
/*  772 */     sparseArray.c(114, "KEYCODE_CTRL_RIGHT");
/*  773 */     sparseArray.c(115, "KEYCODE_CAPS_LOCK");
/*  774 */     sparseArray.c(116, "KEYCODE_SCROLL_LOCK");
/*  775 */     sparseArray.c(117, "KEYCODE_META_LEFT");
/*  776 */     sparseArray.c(118, "KEYCODE_META_RIGHT");
/*  777 */     sparseArray.c(119, "KEYCODE_FUNCTION");
/*  778 */     sparseArray.c(120, "KEYCODE_SYSRQ");
/*  779 */     sparseArray.c(121, "KEYCODE_BREAK");
/*  780 */     sparseArray.c(122, "KEYCODE_MOVE_HOME");
/*  781 */     sparseArray.c(123, "KEYCODE_MOVE_END");
/*  782 */     sparseArray.c(124, "KEYCODE_INSERT");
/*  783 */     sparseArray.c(125, "KEYCODE_FORWARD");
/*  784 */     sparseArray.c(126, "KEYCODE_MEDIA_PLAY");
/*  785 */     sparseArray.c(127, "KEYCODE_MEDIA_PAUSE");
/*  786 */     sparseArray.c(128, "KEYCODE_MEDIA_CLOSE");
/*  787 */     sparseArray.c(129, "KEYCODE_MEDIA_EJECT");
/*  788 */     sparseArray.c(130, "KEYCODE_MEDIA_RECORD");
/*  789 */     sparseArray.c(131, "KEYCODE_F1");
/*  790 */     sparseArray.c(132, "KEYCODE_F2");
/*  791 */     sparseArray.c(133, "KEYCODE_F3");
/*  792 */     sparseArray.c(134, "KEYCODE_F4");
/*  793 */     sparseArray.c(135, "KEYCODE_F5");
/*  794 */     sparseArray.c(136, "KEYCODE_F6");
/*  795 */     sparseArray.c(137, "KEYCODE_F7");
/*  796 */     sparseArray.c(138, "KEYCODE_F8");
/*  797 */     sparseArray.c(139, "KEYCODE_F9");
/*  798 */     sparseArray.c(140, "KEYCODE_F10");
/*  799 */     sparseArray.c(141, "KEYCODE_F11");
/*  800 */     sparseArray.c(142, "KEYCODE_F12");
/*  801 */     sparseArray.c(143, "KEYCODE_NUM_LOCK");
/*  802 */     sparseArray.c(144, "KEYCODE_NUMPAD_0");
/*  803 */     sparseArray.c(145, "KEYCODE_NUMPAD_1");
/*  804 */     sparseArray.c(146, "KEYCODE_NUMPAD_2");
/*  805 */     sparseArray.c(147, "KEYCODE_NUMPAD_3");
/*  806 */     sparseArray.c(148, "KEYCODE_NUMPAD_4");
/*  807 */     sparseArray.c(149, "KEYCODE_NUMPAD_5");
/*  808 */     sparseArray.c(150, "KEYCODE_NUMPAD_6");
/*  809 */     sparseArray.c(151, "KEYCODE_NUMPAD_7");
/*  810 */     sparseArray.c(152, "KEYCODE_NUMPAD_8");
/*  811 */     sparseArray.c(153, "KEYCODE_NUMPAD_9");
/*  812 */     sparseArray.c(154, "KEYCODE_NUMPAD_DIVIDE");
/*  813 */     sparseArray.c(155, "KEYCODE_NUMPAD_MULTIPLY");
/*  814 */     sparseArray.c(156, "KEYCODE_NUMPAD_SUBTRACT");
/*  815 */     sparseArray.c(157, "KEYCODE_NUMPAD_ADD");
/*  816 */     sparseArray.c(158, "KEYCODE_NUMPAD_DOT");
/*  817 */     sparseArray.c(159, "KEYCODE_NUMPAD_COMMA");
/*  818 */     sparseArray.c(160, "KEYCODE_NUMPAD_ENTER");
/*  819 */     sparseArray.c(161, "KEYCODE_NUMPAD_EQUALS");
/*  820 */     sparseArray.c(162, "KEYCODE_NUMPAD_LEFT_PAREN");
/*  821 */     sparseArray.c(163, "KEYCODE_NUMPAD_RIGHT_PAREN");
/*  822 */     sparseArray.c(164, "KEYCODE_VOLUME_MUTE");
/*  823 */     sparseArray.c(165, "KEYCODE_INFO");
/*  824 */     sparseArray.c(166, "KEYCODE_CHANNEL_UP");
/*  825 */     sparseArray.c(167, "KEYCODE_CHANNEL_DOWN");
/*  826 */     sparseArray.c(168, "KEYCODE_ZOOM_IN");
/*  827 */     sparseArray.c(169, "KEYCODE_ZOOM_OUT");
/*  828 */     sparseArray.c(170, "KEYCODE_TV");
/*  829 */     sparseArray.c(171, "KEYCODE_WINDOW");
/*  830 */     sparseArray.c(172, "KEYCODE_GUIDE");
/*  831 */     sparseArray.c(173, "KEYCODE_DVR");
/*  832 */     sparseArray.c(174, "KEYCODE_BOOKMARK");
/*  833 */     sparseArray.c(175, "KEYCODE_CAPTIONS");
/*  834 */     sparseArray.c(176, "KEYCODE_SETTINGS");
/*  835 */     sparseArray.c(177, "KEYCODE_TV_POWER");
/*  836 */     sparseArray.c(178, "KEYCODE_TV_INPUT");
/*  837 */     sparseArray.c(180, "KEYCODE_STB_INPUT");
/*  838 */     sparseArray.c(179, "KEYCODE_STB_POWER");
/*  839 */     sparseArray.c(181, "KEYCODE_AVR_POWER");
/*  840 */     sparseArray.c(182, "KEYCODE_AVR_INPUT");
/*  841 */     sparseArray.c(183, "KEYCODE_PROG_RED");
/*  842 */     sparseArray.c(184, "KEYCODE_PROG_GREEN");
/*  843 */     sparseArray.c(185, "KEYCODE_PROG_YELLOW");
/*  844 */     sparseArray.c(186, "KEYCODE_PROG_BLUE");
/*  845 */     sparseArray.c(187, "KEYCODE_APP_SWITCH");
/*  846 */     sparseArray.c(188, "KEYCODE_BUTTON_1");
/*  847 */     sparseArray.c(189, "KEYCODE_BUTTON_2");
/*  848 */     sparseArray.c(190, "KEYCODE_BUTTON_3");
/*  849 */     sparseArray.c(191, "KEYCODE_BUTTON_4");
/*  850 */     sparseArray.c(192, "KEYCODE_BUTTON_5");
/*  851 */     sparseArray.c(193, "KEYCODE_BUTTON_6");
/*  852 */     sparseArray.c(194, "KEYCODE_BUTTON_7");
/*  853 */     sparseArray.c(195, "KEYCODE_BUTTON_8");
/*  854 */     sparseArray.c(196, "KEYCODE_BUTTON_9");
/*  855 */     sparseArray.c(197, "KEYCODE_BUTTON_10");
/*  856 */     sparseArray.c(198, "KEYCODE_BUTTON_11");
/*  857 */     sparseArray.c(199, "KEYCODE_BUTTON_12");
/*  858 */     sparseArray.c(200, "KEYCODE_BUTTON_13");
/*  859 */     sparseArray.c(201, "KEYCODE_BUTTON_14");
/*  860 */     sparseArray.c(202, "KEYCODE_BUTTON_15");
/*  861 */     sparseArray.c(203, "KEYCODE_BUTTON_16");
/*  862 */     sparseArray.c(204, "KEYCODE_LANGUAGE_SWITCH");
/*  863 */     sparseArray.c(205, "KEYCODE_MANNER_MODE");
/*  864 */     sparseArray.c(206, "KEYCODE_3D_MODE");
/*  865 */     sparseArray.c(207, "KEYCODE_CONTACTS");
/*  866 */     sparseArray.c(208, "KEYCODE_CALENDAR");
/*  867 */     sparseArray.c(209, "KEYCODE_MUSIC");
/*  868 */     sparseArray.c(210, "KEYCODE_CALCULATOR");
/*  869 */     sparseArray.c(211, "KEYCODE_ZENKAKU_HANKAKU");
/*  870 */     sparseArray.c(212, "KEYCODE_EISU");
/*  871 */     sparseArray.c(213, "KEYCODE_MUHENKAN");
/*  872 */     sparseArray.c(214, "KEYCODE_HENKAN");
/*  873 */     sparseArray.c(215, "KEYCODE_KATAKANA_HIRAGANA");
/*  874 */     sparseArray.c(216, "KEYCODE_YEN");
/*  875 */     sparseArray.c(217, "KEYCODE_RO");
/*  876 */     sparseArray.c(218, "KEYCODE_KANA");
/*  877 */     sparseArray.c(219, "KEYCODE_ASSIST");
/*  878 */     sparseArray.c(220, "KEYCODE_BRIGHTNESS_DOWN");
/*  879 */     sparseArray.c(221, "KEYCODE_BRIGHTNESS_UP");
/*  880 */     sparseArray.c(222, "KEYCODE_MEDIA_AUDIO_TRACK");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*  885 */   private static final String[] c = new String[] { "META_SHIFT_ON", "META_ALT_ON", "META_SYM_ON", "META_FUNCTION_ON", "META_ALT_LEFT_ON", "META_ALT_RIGHT_ON", "META_SHIFT_LEFT_ON", "META_SHIFT_RIGHT_ON", "META_CAP_LOCKED", "META_ALT_LOCKED", "META_SYM_LOCKED", "0x00000800", "META_CTRL_ON", "META_CTRL_LEFT_ON", "META_CTRL_RIGHT_ON", "0x00008000", "META_META_ON", "META_META_LEFT_ON", "META_META_RIGHT_ON", "0x00080000", "META_CAPS_LOCK_ON", "META_NUM_LOCK_ON", "META_SCROLL_LOCK_ON", "0x00800000", "0x01000000", "0x02000000", "0x04000000", "0x08000000", "0x10000000", "0x20000000", "0x40000000", "0x80000000" };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int a() {
/* 1266 */     return 222;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1282 */   private static final Object d = new Object();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private int e;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private int f;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private int g;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private int h;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private int i;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private int j;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private int k;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private int l;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private long m;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private long n;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private String o;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static {
/* 1358 */     b();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private KeyEvent() {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final int getDeviceId() {
/* 1856 */     return this.e;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final int getSource() {
/* 1862 */     return this.f;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final long getEventTime() {
/* 2434 */     return this.n;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String toString() {
/* 2782 */     StringBuilder stringBuilder = new StringBuilder();
/* 2783 */     stringBuilder.append("KeyEvent { action=").append(a(this.h));
/* 2784 */     stringBuilder.append(", keyCode=").append(b(this.i));
/* 2785 */     stringBuilder.append(", scanCode=").append(this.j);
/* 2786 */     if (this.o != null) {
/* 2787 */       stringBuilder.append(", characters=\"").append(this.o).append("\"");
/*      */     }
/* 2789 */     stringBuilder.append(", metaState=").append(c(this.g));
/* 2790 */     stringBuilder.append(", flags=0x").append(Integer.toHexString(this.l));
/* 2791 */     stringBuilder.append(", repeatCount=").append(this.k);
/* 2792 */     stringBuilder.append(", eventTime=").append(this.n);
/* 2793 */     stringBuilder.append(", downTime=").append(this.m);
/* 2794 */     stringBuilder.append(", deviceId=").append(this.e);
/* 2795 */     stringBuilder.append(", source=0x").append(Integer.toHexString(this.f));
/* 2796 */     stringBuilder.append(" }");
/* 2797 */     return stringBuilder.toString();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String a(int paramInt) {
/* 2809 */     switch (paramInt) {
/*      */       case 0:
/* 2811 */         return "ACTION_DOWN";
/*      */       case 1:
/* 2813 */         return "ACTION_UP";
/*      */       case 2:
/* 2815 */         return "ACTION_MULTIPLE";
/*      */     } 
/* 2817 */     return Integer.toString(paramInt);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String b(int paramInt) {
/* 2832 */     String str = (String)b.a(paramInt);
/* 2833 */     return (str != null) ? str : Integer.toString(paramInt);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String c(int paramInt) {
/* 2874 */     if (paramInt == 0) {
/* 2875 */       return "0";
/*      */     }
/* 2877 */     StringBuilder stringBuilder = null;
/* 2878 */     byte b = 0;
/* 2879 */     while (paramInt != 0) {
/* 2880 */       boolean bool = ((paramInt & 0x1) != 0) ? true : false;
/* 2881 */       paramInt >>>= 1;
/* 2882 */       if (bool) {
/* 2883 */         String str = c[b];
/* 2884 */         if (stringBuilder == null) {
/* 2885 */           if (paramInt == 0) {
/* 2886 */             return str;
/*      */           }
/* 2888 */           stringBuilder = new StringBuilder(str);
/*      */         } else {
/* 2890 */           stringBuilder.append('|');
/* 2891 */           stringBuilder.append(str);
/*      */         } 
/*      */       } 
/* 2894 */       b++;
/*      */     } 
/* 2896 */     return stringBuilder.toString();
/*      */   }
/*      */   
/* 2899 */   public static final Parcelable.Creator a = new KeyEvent$1();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static KeyEvent a(Parcel paramParcel) {
/* 2913 */     return new KeyEvent(paramParcel);
/*      */   }
/*      */   
/*      */   private KeyEvent(Parcel paramParcel) {
/* 2917 */     this.e = paramParcel.readInt();
/* 2918 */     this.f = paramParcel.readInt();
/* 2919 */     this.h = paramParcel.readInt();
/* 2920 */     this.i = paramParcel.readInt();
/* 2921 */     this.k = paramParcel.readInt();
/* 2922 */     this.g = paramParcel.readInt();
/* 2923 */     this.j = paramParcel.readInt();
/* 2924 */     this.l = paramParcel.readInt();
/* 2925 */     this.m = paramParcel.readLong();
/* 2926 */     this.n = paramParcel.readLong();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeToParcel(Parcel paramParcel, int paramInt) {
/* 2932 */     paramParcel.writeInt(this.e);
/* 2933 */     paramParcel.writeInt(this.f);
/* 2934 */     paramParcel.writeInt(this.h);
/* 2935 */     paramParcel.writeInt(this.i);
/* 2936 */     paramParcel.writeInt(this.k);
/* 2937 */     paramParcel.writeInt(this.g);
/* 2938 */     paramParcel.writeInt(this.j);
/* 2939 */     paramParcel.writeInt(this.l);
/* 2940 */     paramParcel.writeLong(this.m);
/* 2941 */     paramParcel.writeLong(this.n);
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\android\view\KeyEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */