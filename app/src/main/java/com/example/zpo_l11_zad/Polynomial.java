package com.example.zpo_l11_zad;

import java.util.Arrays;
import java.util.Collections;

public class Polynomial {
    private String[] tab;

    public Polynomial(String[] tab) {
        this.tab = tab;
    }

    public String[] getTab() {
        return tab;
    }

    public void setTab(String[] tab) {
        this.tab = tab;
    }

    public String insertX(double val) {
        String result = toString().replace("x", "(" + val + ")");
        return result;
    }

    @Override
    public String toString() {
        String[] add = new String[tab.length];
        String[] addRev = new String[add.length];
        String result = "";

        for (int i = tab.length - 1; i >= 0; i--) {
            if (i == tab.length - 1) {
                add[i] = tab[tab.length - 1 - i] + "x%5E" + i;
            } else {
                    add[i] = "%2B" + tab[tab.length - 1 - i] + "x%5E" + i;
                }
            }

        for (int j = 0; j < add.length; j++) {
            addRev[j] = add[add.length - 1 - j];
        }

        result = Arrays.toString(addRev);
        result = result.replace(",", "");
        result = result.replace("-", "%2D");
        result = result.replace("%2B%2D", "%2D");

        result = result.substring(1, result.length() - 1);
        return result;
    }
}
