/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class CompanyDir {
    
    ArrayList<Company> companyList;

    public CompanyDir() {
        companyList = new ArrayList<>();
    }

    public ArrayList<Company> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(ArrayList<Company> companyList) {
        this.companyList = companyList;
    }
    
    public void clearAll(){
        companyList.clear();
    }
    
    public Company addCompany(){
        Company newCompany = new Company();
        companyList.add(newCompany);
        return newCompany;
    }
    
    public void deleteCompany(Company delCompany){
        companyList.remove(delCompany);
    }
    
    public Company searchCompany(Company searchCompany){
        for(Company company : companyList){
            if(company.equals(searchCompany)){
                return company;
            }
        }
        return null;
    }
    
    public Company searchById(Integer id){
        for(Company company : companyList){
            if(company.getId().equals(id)){
                return company;
            }
        }
        return null;
    }
    
    public ArrayList<Company> searchByName(String name){
        ArrayList<Company> temp = new ArrayList<Company>();
        for(Company company : companyList){
            if(company.getName().equalsIgnoreCase(name)){
                
                temp.add(company);
            }
        }
        return temp;
    }
    
    public Company searchByCompanyName(String name){
        ArrayList<Company> temp = new ArrayList<Company>();
        for(Company company : companyList){
            if(company.getName().equalsIgnoreCase(name)){
                
                return company;
            }
        }
        return null;
    }
    
    public Company searchByUsername(String username){
        for(Company company : companyList){
            if(company.getUsername().equals(username)){
                return company;
            }
        }
        return null;
    }
    
    public Company searchByDistrict(String district){
        for(Company company : companyList){
            if(company.getDistrict().equals(district)){
                return company;
            }
        }
        return null;
    }
    
    public Company searchByState(String state){
        for(Company company : companyList){
            if(company.getState().equals(state)){
                return company;
            }
        }
        return null;
    }
    
    public ArrayList<Company> searchByCountry(String country){
        ArrayList<Company> temp = new ArrayList<>();
        for(Company company : companyList){
            if(company.getCountry().equalsIgnoreCase(country)){
                
                temp.add(company);
            }
        }
        return temp;
    }
    
    public Company searchByPincode(String pincode){
        for(Company company : companyList){
            if(company.getPincode().equals(pincode)){
                return company;
            }
        }
        return null;
    }
    
    public ArrayList<Company> updateCompany(Company oldCompany,Company updateCompany){
        Integer ind = companyList.indexOf(oldCompany);
        companyList.set(ind, updateCompany);
        return companyList;
    }
    
}
