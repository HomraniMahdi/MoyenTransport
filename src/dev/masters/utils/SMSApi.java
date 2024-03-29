package dev.masters.utils;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

/**
 *
 * @author Mahdi
 */
public class SMSApi {

    public SMSApi() {
    }
    public static final String ACCOUNT_SID = "ACcb016d5d5b4e05ea366d44ec5227e10c";
    public static final String AUTH_TOKEN = "08f1ee7bcf745b1d6a526babc505730f";

    public void sendSMS(String num, String msg) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber("+21658932889"),
                new PhoneNumber("+12565679612"),
                "Votre nouveau moyenne de transport est ajouté avec succée, " + msg).create();

        System.out.println(message.getSid());

    }
}
