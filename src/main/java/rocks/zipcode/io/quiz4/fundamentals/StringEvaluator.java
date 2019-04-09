package rocks.zipcode.io.quiz4.fundamentals;


import java.util.ArrayList;
import java.util.HashSet;

import java.util.List;
import java.util.Set;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> allSubs = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j <= string.length(); j++) {
                    allSubs.add(string.substring(i,j));
             }
          }
        return allSubs.toArray(new String[allSubs.size()]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        String [] subStrings1 = getAllSubstrings(string1);
        String [] subDub = getAllSubstrings(string2);
        List<String> common = new ArrayList<>();
        for (int i = 0; i < subStrings1.length; i++) {
            for (int j = 0; j < subDub.length; j++) {
             if(subStrings1[i].equals(subDub[j])){
                 common.add(subStrings1[i]);
                }
            }
        }
           return common.toArray(new String[common.size()]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] commonSubs = getCommonSubstrings(string1, string2);
        String bigCommon = commonSubs[0];
        for (int i = 1; i < commonSubs.length; i++) {
            if (commonSubs[i].length() > bigCommon.length()) {
                bigCommon = commonSubs[i];
                }
             }
             return bigCommon;
         }
    }

