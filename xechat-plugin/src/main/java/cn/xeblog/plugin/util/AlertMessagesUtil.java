package cn.xeblog.plugin.util;

import com.intellij.openapi.ui.MessageUtil;
import com.intellij.openapi.ui.Messages;
import javax.swing.*;

/**
 * @author LYF
 * @date 2022-07-21
 */
public class AlertMessagesUtil {
    public static void showInfoDialog(String title, String message) {
        showMessageDialog(title, message, new String[]{"确定"}, Messages.getInformationIcon());
    }

    public static void showWarningDialog(String title, String message) {
        showMessageDialog(title, message, new String[]{"确定"}, Messages.getWarningIcon());
    }

    public static void showErrorDialog(String title, String message) {
        showMessageDialog(title, message, new String[]{"确定"}, Messages.getErrorIcon());
    }

    public static boolean showYesNoDialog(String title, String message) {
        return showYesNoDialog(title, message, "确定", "取消");
    }

    public static boolean showYesNoDialog(String title, String message, String yesText, String noText) {
        return MessageUtil.showYesNoDialog(title,message,null,yesText,noText,Messages.getQuestionIcon());
    }

    public static void showMessageDialog(String title, String message, String[] options, Icon icon) {
        Messages.showDialog(message, title, options, 0, -1, icon, null);
    }
}
