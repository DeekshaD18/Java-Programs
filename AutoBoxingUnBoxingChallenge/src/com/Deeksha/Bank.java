package com.Deeksha;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<Branch>();
    }

    public boolean addCustomer(String branchName, String custName, Double initTransaction){
        for(int i = 0; i<branches.size(); i++){
            if()
        }
    }

    public boolean addBranch(String name){
        if(findBranch(name)==null){
            Branch.addBranch(name);
            return true;
        }
        System.out.println(name+" Already Exists.");
        return false;
    }

    public Branch findBranch(String name){
        for(int i =0; i<branches.size(); i++){
            if(branches.get(i).getName().equals(name)){
                return branches.get(i);
            }
        }
        return null;
    }
}
