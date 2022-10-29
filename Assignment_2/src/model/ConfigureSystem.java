/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author AMEYA A
 */
public class ConfigureSystem {


    ArrayList<Person> p;
    House h1,h2,h3,h4,h5,h6,h7,h8,h9,h10;
    ArrayList<House> houseList1,houseList2,houseList3,houseList4,houseList5;
    Hospital hp1,hp2,hp3,hp4;
    ArrayList<Hospital> hospitalList1,hospitalList2,hospitalList3,hospitalList4;
    ArrayList<Hospital> hospitalDirUpdate;
    HospitalDirectory hospDir;
    Community c1,c2,c3,c4;
    ArrayList<Community> communityList1,communityList2,communityList3,communityList4,communityMasterList;
    MasterDB masterRow1,masterRow2,masterRow3,masterRow4;
    MasterDBDirectory masterTable;
    ArrayList<MasterDB> masterList;
    public ArrayList<Community> getCommunityList4() {
        return communityList4;
    }

    public void setCommunityList4(ArrayList<Community> communityList4) {
        this.communityList4 = communityList4;
    }
    City cy1,cy2,cy3,cy4;

    public City getCy4() {
        return cy4;
    }

    public void setCy4(City cy4) {
        this.cy4 = cy4;
    }
    ArrayList<City> cityList;
    CityDirectory cityDir;
    Doctor d1,d2,d3,d4;
    ArrayList<Doctor> doctorList;
    DoctorDirectory docDir;
    Patient pat1,pat2,pat3,pat4,pat5,pat6;
    PatientDirectory patDir;
    VitalSigns vs1,vs2,vs3;
    Encounter ench1,ench2;
    ArrayList<Encounter> encList,encHList;
    EncounterHistory encH;
    
    
    public MasterDB getMasterRow1() {
        return masterRow1;
    }

    public void setMasterRow1(MasterDB masterRow1) {
        this.masterRow1 = masterRow1;
    }

    public MasterDB getMasterRow2() {
        return masterRow2;
    }

    public void setMasterRow2(MasterDB masterRow2) {
        this.masterRow2 = masterRow2;
    }

    public MasterDB getMasterRow3() {
        return masterRow3;
    }

    public void setMasterRow3(MasterDB masterRow3) {
        this.masterRow3 = masterRow3;
    }

    public MasterDB getMasterRow4() {
        return masterRow4;
    }

    public void setMasterRow4(MasterDB masterRow4) {
        this.masterRow4 = masterRow4;
    }

    public MasterDBDirectory getMasterTable() {
        return masterTable;
    }

    public void setMasterTable(MasterDBDirectory masterTable) {
        this.masterTable = masterTable;
    }

    public ArrayList<MasterDB> getMasterList() {
        return masterList;
    }

    public void setMasterList(ArrayList<MasterDB> masterList) {
        this.masterList = masterList;
    }

    public ArrayList<Person> getP() {
        return p;
    }

    public void setP(ArrayList<Person> p) {
        this.p = p;
    }

    public House getH1() {
        return h1;
    }

    public void setH1(House h1) {
        this.h1 = h1;
    }

    public House getH2() {
        return h2;
    }

    public void setH2(House h2) {
        this.h2 = h2;
    }

    public House getH3() {
        return h3;
    }

    public void setH3(House h3) {
        this.h3 = h3;
    }

    public House getH4() {
        return h4;
    }

    public void setH4(House h4) {
        this.h4 = h4;
    }

    public House getH5() {
        return h5;
    }

    public void setH5(House h5) {
        this.h5 = h5;
    }

    public House getH6() {
        return h6;
    }

    public void setH6(House h6) {
        this.h6 = h6;
    }

    public House getH7() {
        return h7;
    }

    public void setH7(House h7) {
        this.h7 = h7;
    }

    public House getH8() {
        return h8;
    }

    public void setH8(House h8) {
        this.h8 = h8;
    }

    public House getH9() {
        return h9;
    }

    public void setH9(House h9) {
        this.h9 = h9;
    }

    public House getH10() {
        return h10;
    }

    public void setH10(House h10) {
        this.h10 = h10;
    }

    public ArrayList<House> getHouseList1() {
        return houseList1;
    }

    public void setHouseList1(ArrayList<House> houseList1) {
        this.houseList1 = houseList1;
    }

    public ArrayList<House> getHouseList2() {
        return houseList2;
    }

    public void setHouseList2(ArrayList<House> houseList2) {
        this.houseList2 = houseList2;
    }

    public ArrayList<House> getHouseList3() {
        return houseList3;
    }

    public void setHouseList3(ArrayList<House> houseList3) {
        this.houseList3 = houseList3;
    }

    public ArrayList<House> getHouseList4() {
        return houseList4;
    }

    public void setHouseList4(ArrayList<House> houseList4) {
        this.houseList4 = houseList4;
    }

    public ArrayList<House> getHouseList5() {
        return houseList5;
    }

    public void setHouseList5(ArrayList<House> houseList5) {
        this.houseList5 = houseList5;
    }

    public Hospital getHp1() {
        return hp1;
    }

    public void setHp1(Hospital hp1) {
        this.hp1 = hp1;
    }

    public Hospital getHp2() {
        return hp2;
    }

    public void setHp2(Hospital hp2) {
        this.hp2 = hp2;
    }

    public Hospital getHp3() {
        return hp3;
    }

    public void setHp3(Hospital hp3) {
        this.hp3 = hp3;
    }

    public Hospital getHp4() {
        return hp4;
    }

    public void setHp4(Hospital hp4) {
        this.hp4 = hp4;
    }
//
//    public Hospital getHp5() {
//        return hp5;
//    }
//
//    public void setHp5(Hospital hp5) {
//        this.hp5 = hp5;
//    }
//
//    public Hospital getHp6() {
//        return hp6;
//    }
//
//    public void setHp6(Hospital hp6) {
//        this.hp6 = hp6;
//    }
//
//    public Hospital getHp7() {
//        return hp7;
//    }

    public ArrayList<City> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<City> cityList) {
        this.cityList = cityList;
    }

    public CityDirectory getCityDir() {
        return cityDir;
    }

    public void setCityDir(CityDirectory cityDir) {
        this.cityDir = cityDir;
    }

    public Doctor getD1() {
        return d1;
    }

    public void setD1(Doctor d1) {
        this.d1 = d1;
    }

    public Doctor getD2() {
        return d2;
    }

    public void setD2(Doctor d2) {
        this.d2 = d2;
    }

    public Doctor getD3() {
        return d3;
    }

    public void setD3(Doctor d3) {
        this.d3 = d3;
    }

    public Doctor getD4() {
        return d4;
    }

    public void setD4(Doctor d4) {
        this.d4 = d4;
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    public DoctorDirectory getDocDir() {
        return docDir;
    }

    public void setDocDir(DoctorDirectory docDir) {
        this.docDir = docDir;
    }

    public Patient getPat1() {
        return pat1;
    }

    public void setPat1(Patient pat1) {
        this.pat1 = pat1;
    }

    public Patient getPat2() {
        return pat2;
    }

    public void setPat2(Patient pat2) {
        this.pat2 = pat2;
    }

    public Patient getPat3() {
        return pat3;
    }

    public void setPat3(Patient pat3) {
        this.pat3 = pat3;
    }

    public Patient getPat4() {
        return pat4;
    }

    public void setPat4(Patient pat4) {
        this.pat4 = pat4;
    }

    public Patient getPat5() {
        return pat5;
    }

    public void setPat5(Patient pat5) {
        this.pat5 = pat5;
    }

    public Patient getPat6() {
        return pat6;
    }

    public void setPat6(Patient pat6) {
        this.pat6 = pat6;
    }

    public PatientDirectory getPatDir() {
        return patDir;
    }

    public void setPatDir(PatientDirectory patDir) {
        this.patDir = patDir;
    }

    public VitalSigns getVs1() {
        return vs1;
    }

    public void setVs1(VitalSigns vs1) {
        this.vs1 = vs1;
    }

    public VitalSigns getVs2() {
        return vs2;
    }

    public void setVs2(VitalSigns vs2) {
        this.vs2 = vs2;
    }

    public VitalSigns getVs3() {
        return vs3;
    }

    public void setVs3(VitalSigns vs3) {
        this.vs3 = vs3;
    }
//
//    public void setHp7(Hospital hp7) {
//        this.hp7 = hp7;
//    }
//
//    public Hospital getHp8() {
//        return hp8;
//    }
//
//    public void setHp8(Hospital hp8) {
//        this.hp8 = hp8;
//    }
//
//    public Hospital getHp9() {
//        return hp9;
//    }
//
//    public void setHp9(Hospital hp9) {
//        this.hp9 = hp9;
//    }
//
//    public Hospital getHp10() {
//        return hp10;
//    }
//
//    public void setHp10(Hospital hp10) {
//        this.hp10 = hp10;
//    }

    public ArrayList<Hospital> getHospitalList1() {
        return hospitalList1;
    }

    public void setHospitalList1(ArrayList<Hospital> hospitalList1) {
        this.hospitalList1 = hospitalList1;
    }

    public ArrayList<Hospital> getHospitalList2() {
        return hospitalList2;
    }

    public void setHospitalList2(ArrayList<Hospital> hospitalList2) {
        this.hospitalList2 = hospitalList2;
    }

    public ArrayList<Hospital> getHospitalList3() {
        return hospitalList3;
    }

    public void setHospitalList3(ArrayList<Hospital> hospitalList3) {
        this.hospitalList3 = hospitalList3;
    }

    public ArrayList<Hospital> getHospitalList4() {
        return hospitalList4;
    }

    public void setHospitalList4(ArrayList<Hospital> hospitalList4) {
        this.hospitalList4 = hospitalList4;
    }

//    public ArrayList<Hospital> getHospitalList5() {
//        return hospitalList5;
//    }
//
//    public void setHospitalList5(ArrayList<Hospital> hospitalList5) {
//        this.hospitalList5 = hospitalList5;
//    }

    public ArrayList<Hospital> getHospitalDirUpdate() {
        return hospitalDirUpdate;
    }

    public void setHospitalDirUpdate(ArrayList<Hospital> hospitalDirUpdate) {
        this.hospitalDirUpdate = hospitalDirUpdate;
    }

    public HospitalDirectory getHospDir() {
        return hospDir;
    }

    public void setHospDir(HospitalDirectory hospDir) {
        this.hospDir = hospDir;
    }

    public Community getC1() {
        return c1;
    }

    public void setC1(Community c1) {
        this.c1 = c1;
    }

    public Community getC2() {
        return c2;
    }

    public void setC2(Community c2) {
        this.c2 = c2;
    }

    public Community getC3() {
        return c3;
    }

    public void setC3(Community c3) {
        this.c3 = c3;
    }

    public Community getC4() {
        return c4;
    }

    public void setC4(Community c4) {
        this.c4 = c4;
    }
//
//    public Community getC5() {
//        return c5;
//    }
//
//    public void setC5(Community c5) {
//        this.c5 = c5;
//    }

    public ArrayList<Community> getCommunityList1() {
        return communityList1;
    }

    public void setCommunityList1(ArrayList<Community> communityList1) {
        this.communityList1 = communityList1;
    }

    public ArrayList<Community> getCommunityList2() {
        return communityList2;
    }

    public void setCommunityList2(ArrayList<Community> communityList2) {
        this.communityList2 = communityList2;
    }

    public ArrayList<Community> getCommunityList3() {
        return communityList3;
    }

    public void setCommunityList3(ArrayList<Community> communityList3) {
        this.communityList3 = communityList3;
    }

    public City getCy1() {
        return cy1;
    }

    public void setCy1(City cy1) {
        this.cy1 = cy1;
    }

    public City getCy2() {
        return cy2;
    }

    public void setCy2(City cy2) {
        this.cy2 = cy2;
    }

    public City getCy3() {
        return cy3;
    }

    public void setCy3(City cy3) {
        this.cy3 = cy3;
    }

    public ArrayList<Community> getCommunityMasterList() {
        return communityMasterList;
    }

    public void setCommunityMasterList(ArrayList<Community> communityMasterList) {
        this.communityMasterList = communityMasterList;
    }
    
    public ConfigureSystem() {
        PersonDirectory pDir = new PersonDirectory();
        p = pDir.createPersonDir();
        doctorList = new ArrayList<Doctor>();
        d1 = new Doctor(p.get(0));
        d2 = new Doctor(p.get(1));
        d3 = new Doctor(p.get(4));
        d4 = new Doctor(p.get(5));
        doctorList.add(d1);
        doctorList.add(d2);
        doctorList.add(d3);
        doctorList.add(d4);
        docDir = new DoctorDirectory(doctorList);
        
        vs1 = new VitalSigns("VS1","Blood Pressure");
        vs2 = new VitalSigns("VS2","Stomach Disorder");
        vs3 = new VitalSigns("VS3", "Throat Infection");
        
        pat1 = new Patient(p.get(2),vs1);
        pat2 = new Patient(p.get(3),vs2);
        pat3 = new Patient(p.get(6),vs3);
        pat4 = new Patient(p.get(7),vs3);
        pat5 = new Patient(p.get(8),vs2);
        pat6 = new Patient(p.get(9),vs1);
                
        h1 = new House("H1","house1");
        h2 = new House("H2","house2");
        h3 = new House("H3","house3");
        h4 = new House("H4","house4");
        h5 = new House("H5","house5");
        h6 = new House("H6","house6");
        h7 = new House("H7","house7");
        h8 = new House("H8","house8");
        h9 = new House("H9","house9");
        h10 = new House("H10","house10");
        houseList1 = new ArrayList<>();
        houseList2 = new ArrayList<>();
        houseList3 = new ArrayList<>();
        houseList4 = new ArrayList<>();
        houseList5 = new ArrayList<>();
        houseList5 = new ArrayList<>();
        houseList1.add(h1);
        houseList1.add(h2);
        houseList2.add(h3);
        houseList2.add(h4);
        houseList3.add(h5);
        houseList3.add(h6);
        houseList4.add(h7);
        houseList4.add(h8);
        houseList5.add(h9);
        houseList5.add(h10);
        
        hp1 = new Hospital("HP1","hospital1",d1);
        hp2 = new Hospital("HP2","hospital2",d2);
        hp3 = new Hospital("HP3","hospital3",d3);
        hp4 = new Hospital("HP4","hospital4",d4);
//        hp5 = new Hospital("HP5","hospital5",d2);
//        hp6 = new Hospital("HP6","hospital6",d2);
//        hp7 = new Hospital("HP7","hospital7",d3);
//        hp8 = new Hospital("HP8","hospital8",d3);
//        hp9 = new Hospital("HP9","hospital9",d4);
//        hp10 = new Hospital("HP10","hospital10",d4);
        hospitalList1 = new ArrayList<>();
        hospitalList2 = new ArrayList<>();
        hospitalList3 = new ArrayList<>();
        hospitalList4 = new ArrayList<>();
//        hospitalList5 = new ArrayList<>();
        hospitalList1.add(hp1);
//        hospitalList1.add(hp2);
        hospitalList2.add(hp2);
//        hospitalList2.add(hp4);
        hospitalList3.add(hp3);
//        hospitalList3.add(hp6);
        hospitalList4.add(hp4);
//        hospitalList4.add(hp8);
//        hospitalList5.add(hp9);
//        hospitalList5.add(hp10);
        
        hospitalDirUpdate = new ArrayList<>();
        hospitalDirUpdate.add(hp1);
        hospitalDirUpdate.add(hp2);
        hospitalDirUpdate.add(hp3);
        hospitalDirUpdate.add(hp4);
//        hospitalDirUpdate.add(hp5);
//        hospitalDirUpdate.add(hp6);
//        hospitalDirUpdate.add(hp7);
//        hospitalDirUpdate.add(hp8);
//        hospitalDirUpdate.add(hp8);
//        hospitalDirUpdate.add(hp10);        
        hospDir = new HospitalDirectory(hospitalDirUpdate);
        
        c1 = new Community(houseList1,"comm1",hospitalList1,"C1");
        c2 = new Community(houseList2,"comm2",hospitalList2,"C2");
        c3 = new Community(houseList3,"comm3",hospitalList3,"C3");
        c4 = new Community(houseList4,"comm4",hospitalList4,"C4");
//        c5 = new Community(houseList5,"comm5",hospitalList5,"C5");
        communityList1 = new ArrayList<>();
        communityList2 = new ArrayList<>();
        communityList3 = new ArrayList<>();
        communityList4 = new ArrayList<>();
        communityList1.add(c1);
        communityList2.add(c2);
        communityList3.add(c3);
        communityList4.add(c4);
        
//        communityList3.add(c5);
        communityMasterList = new ArrayList<Community>();
        communityMasterList.add(c1);
        communityMasterList.add(c2);
        communityMasterList.add(c3);
        communityMasterList.add(c4);
//        communityMasterList.add(c5);
        
        
        cy1 = new City(hospitalList1,communityList1,"Boston","CY1");
        cy2 = new City(hospitalList2,communityList2,"Needham","CY2");
        cy3 = new City(hospitalList3,communityList3,"Worcester","CY3");
        cy4 = new City(hospitalList4,communityList4,"Brighton","CY4");
        
        cityList = new ArrayList<City>();
        cityList.add(cy1);
        cityList.add(cy2);
        cityList.add(cy3);
        cityDir = new CityDirectory(cityList);
        
        masterRow1 = new MasterDB(cy1,hp1,d1,c1);
        masterRow2 = new MasterDB(cy2,hp2,d2,c2);
        masterRow3 = new MasterDB(cy3,hp3,d3,c3);
        masterRow4 = new MasterDB(cy4,hp4,d4,c4);
        
        
        masterList = new ArrayList<MasterDB>();
        masterList.add(masterRow1);
        masterList.add(masterRow2);
        masterList.add(masterRow3);
        masterList.add(masterRow4);
        masterTable = new MasterDBDirectory(masterList);
        
        ench1 = new Encounter("2021-11-22T16:44:58.643067","E1",d1,pat1);
        ench2 = new Encounter("2021-11-22T16:44:58.643067","E1",d1,pat1); 
        encHList = new ArrayList<Encounter>();
        encHList.add(ench1);
        encHList.add(ench2);
        encH = new EncounterHistory(encHList);
        
    }
        
    
}
