package com.example.zpo_l11_zad;

import java.util.Arrays;

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
        String[] add = {};
        String result = "";

        for (int i = tab.length; i < 0; i--) {
            if (i == tab.length) {
                add[i] = tab[i] + "x%5E" + i;
            } else {
                if (tab[i].contains("-")) {
                    add[i] = tab[i] + "x%5E" + i;
                } else {
                    add[i] = "+" + tab[i] + "x%5E" + i;
                }
            }
        }

        result = Arrays.toString(add);
        return result;
    }
}
