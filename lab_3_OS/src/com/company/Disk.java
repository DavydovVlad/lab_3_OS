package com.company;

import java.util.ArrayList;

public class Disk {
    private ArrayList<Page> swappingPages = new ArrayList<>();

    public void Append(Page page) {
        swappingPages.add(page);
    }

    public Page isInDisk(Page page) {
        for (Page swappingPage : swappingPages) {
            if (page.getID() == swappingPage.getID()) {
                if(page.getProcessID() == swappingPage.getProcessID()) {
                    return swappingPage;
                }
            }
        }
        return null;
    }

}

