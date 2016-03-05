package dev.tcc.caique.medreport.utils;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.util.Log;
import android.util.Patterns;

import java.util.regex.Pattern;

/**
 * Created by Avell B153 MAX on 05/03/2016.
 */
public class Utils {
    public static Account[] getAccounts(Context context){
        Pattern emailPattern = Patterns.EMAIL_ADDRESS; // API level 8+
        Account[] accounts = AccountManager.get(context).getAccountsByType("com.google");
        for (Account account : accounts) {
            if (emailPattern.matcher(account.name).matches()) {
                String possibleEmail = account.name;
                String type = account.type;
                Log.i("Email", possibleEmail);
                Log.i("Type", type);
            }
        }
        return  accounts;
    }
}