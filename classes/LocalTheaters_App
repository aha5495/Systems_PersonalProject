package com.example.iota_theaters;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

@SuppressWarnings("ALL")
public class LocalTheaters_App {
    @FXML
    private Label userName_notify;
    //Declare all our Basic buttons and Actions
    @FXML
    private Button btn_Account;
    @FXML
    private Button btn_BookTicket;
    @FXML
    private Button btn_ConfirmTicket;
    @FXML
    private Button btn_Credits;
    @FXML
    private Button btn_EditTicket;
    @FXML
    private Button btn_FoodMenu;
    @FXML
    private Button btn_LocalTheaters;
    @FXML
    private Button btn_AddNew;
    @FXML
    private Button btnEdit;
    @FXML
    private Button btnedit;
    @FXML
    private Button login;
    @FXML
    private Label message;
    @FXML
    private Label Company;
    @FXML
    private ImageView poster1;
    @FXML
    private ImageView poster2Films;
    @FXML
    private ImageView poster3Films;
    @FXML
    private Button btn_CreateAcc;
    //Fields for Sign Up/Login
    @FXML
    private TextField user_FName;
    @FXML
    private TextField user_MName;
    @FXML
    private TextField user_LName;
    @FXML
    private TextField user_Age;
    @FXML
    private TextField user_resNumber;
    @FXML
    private TextField user_Street;
    @FXML
    private TextField user_City;
    @FXML
    private TextField user_State;
    @FXML
    private TextField user_Zip;
    @FXML
    private TextField user_Country;
    @FXML
    private TextField critOne;
    @FXML
    private TextField critTwo;
    public ListView<Theater> USA_Theaters=new ListView<>();
    public ObservableList<Theater> availableTheaters=FXCollections.observableArrayList();
    @FXML
    private TextField Theaters_val;
    private Integer num;
    //Need an observable List and a ListView!!
    @FXML
    private ListView<Person> Customers_View=new ListView<>();
    @FXML
    private ObservableList<Person> allPatrons= FXCollections.observableArrayList();
    //September 29:We are now going to be importing our List class as an object;
    private ArrayList<Child> children=new ArrayList<>();
    private ArrayList<Adult> adults=new ArrayList<>();
    //Create listViews and Observables for each of the subclasses;
    private ListView<Child> allKids=new ListView<>();
    private ListView<Adult> over18=new ListView<>();
    private ObservableList<Child> youngsters=FXCollections.observableArrayList();
    private ObservableList<Adult> olderOnes=FXCollections.observableArrayList();
    private patronList totalPatrons;
    //Text Areas for both types of people;
    @FXML
    private TextArea child_GroupView;
    @FXML
    private TextArea adult_GroupView;
    //Object
    private Person c1;
    //Declaring the variables in this section
    String firstN,middleN,lastN;
    int Age;
    int homeNum,zipcode;
    String street,city,state,country;
    Home address;
    String cus_cred1,cus_cred2;
    String cus_credA,cus_credB;
    //Username and Password variables
    @FXML
    private TextField userName;
    @FXML
    private TextField cus_password;
    @FXML
    void initialize() {
        btn_Account.setVisible(true);
        btn_BookTicket.setVisible(true);
        btn_ConfirmTicket.setVisible(true);
        btn_Credits.setVisible(true);
        btn_EditTicket.setVisible(true);
        btn_FoodMenu.setVisible(true);
        btn_LocalTheaters.setVisible(true);
        //Creating our Images for the start scene;
        user_FName.setVisible(false);
        user_MName.setVisible(false);
        user_LName.setVisible(false);
        user_Age.setVisible(false);
        user_resNumber.setVisible(false);
        user_Street.setVisible(false);
        user_City.setVisible(false);
        user_State.setVisible(false);
        user_Zip.setVisible(false);
        user_Country.setVisible(false);
        userName.setVisible(false);
        cus_password.setVisible(false);
        btn_CreateAcc.setVisible(false);
        userName_notify.setVisible(false);
        btn_AddNew.setVisible(false);
        btnEdit.setVisible(false);
        btnedit.setVisible(false);
        critOne.setVisible(false);
        critTwo.setVisible(false);
        Theaters_val.setVisible(false);
        Customers_View.setVisible(false);
        login.setVisible(false);
        allKids.setVisible(false);
        over18.setVisible(false);
        totalPatrons = new patronList(adults, children);
        child_GroupView.setText(totalPatrons.List_Ofchildren());
        adult_GroupView.setText(totalPatrons.List_OfAdults());
        //Add all possible USA Theaters to the ListView and ObservableList;
        Home CinUno = new Home(110, "Bartlett Ave", "Exton", "PA", 19341, "USA");
        CinUno.setHomeNum(110);
        CinUno.setHouseStreet("Bartlett Ave");
        CinUno.setLocal_area("Exton");
        CinUno.setState("PA");
        CinUno.setZipcode(19341);
        CinUno.setCountry("USA");
        Home REGAL = new Home(100, "Quarry Rd", "Downingtown", "PA", 19335, "USA");
        REGAL.setHomeNum(100);
        REGAL.setHouseStreet("Quarry Rd");
        REGAL.setLocal_area("Downingtown");
        REGAL.setState("PA");
        REGAL.setZipcode(19335);
        REGAL.setCountry("USA");
        Home Wilm1 = new Home(112, "Wilmington Pike", "West Chester", "PA", 19382, "USA");
        Wilm1.setHomeNum(112);
        Wilm1.setHouseStreet("Wilmington Pike");
        Wilm1.setLocal_area("West Chester");
        Wilm1.setState("PA");
        Wilm1.setZipcode(19382);
        Wilm1.setCountry("USA");
        Home KOP1 = new Home(300, "Goddard Blvd", "King of Prussia", "Pennsylvania", 19406, "USA");
        KOP1.setHomeNum(300);
        KOP1.setHouseStreet("Goddard Blvd");
        KOP1.setLocal_area("King of Prussia");
        KOP1.setState("PA");
        KOP1.setZipcode(19406);
        KOP1.setCountry("USA");
        Home C2inCo = new Home(4012, "Walnut St", "Philadelphia", "PA", 19104, "USA");
        C2inCo.setHomeNum(4012);
        C2inCo.setHouseStreet("Walnut St");
        C2inCo.setLocal_area("Philadelphia");
        C2inCo.setState("PA");
        C2inCo.setZipcode(19104);
        C2inCo.setCountry("USA");
        Home Theatre = new Home(2, "E Rosedale Ave", "West Chester", "PA", 19382, "USA");
        Theatre.setHomeNum(2);
        Theatre.setHouseStreet("E Rosedale Ave");
        Theatre.setLocal_area("West Chester");
        Theatre.setState("PA");
        Theatre.setZipcode(19382);
        Theatre.setCountry("USA");
        Home DelSpot = new Home(3300, "Brandywine Pkwy", "Wilmington", "Delaware", 19803, "USA");
        DelSpot.setHomeNum(3300);
        DelSpot.setHouseStreet("Wilmington Pike");
        DelSpot.setLocal_area("Delaware");
        DelSpot.setState("PA");
        DelSpot.setZipcode(19803);
        DelSpot.setCountry("USA");
        Home perfomers = new Home(19, "Hagerty Blvd", "West Chester", "PA", 19382, "USA");
        perfomers.setHomeNum(19);
        perfomers.setHouseStreet("Hagerty Blvd");
        perfomers.setLocal_area("West Chester");
        perfomers.setState("PA");
        perfomers.setZipcode(19382);
        perfomers.setCountry("USA");
        Home PENNSTATEFILMS = new Home(125, "Premiere Dr", "State College", "PA", 16801, "USA");
        PENNSTATEFILMS.setHomeNum(125);
        PENNSTATEFILMS.setHouseStreet("Premiere Dr");
        PENNSTATEFILMS.setLocal_area("State College");
        PENNSTATEFILMS.setState("PA");
        PENNSTATEFILMS.setZipcode(16801);
        PENNSTATEFILMS.setCountry("USA");
        Home C9T = new Home(3031, "Carnegie Dr", "State College", "PA", 16803, "USA");
        C9T.setHomeNum(3031);
        C9T.setHouseStreet("Carnegie Dr");
        C9T.setLocal_area("State College");
        C9T.setState("PA");
        C9T.setZipcode(16803);
        C9T.setCountry("USA");
        Home symphonySpace=new Home(2537,"Broadway at W. 95th St","New York City","NY",10025,"USA");
        symphonySpace.setHomeNum(2537);
        symphonySpace.setHouseStreet("Broadway at W. 95th St");
        symphonySpace.setLocal_area("New York City");
        symphonySpace.setState("NY");
        symphonySpace.setZipcode(10025);
        symphonySpace.setCountry("USA");
        Home rtNY=new Home(247,"W 42nd St","New York","NY",10036,"USA");
        rtNY.setHomeNum(247);
        rtNY.setHouseStreet("W 42nd St");
        rtNY.setLocal_area("New York");
        rtNY.setState("NY");
        rtNY.setZipcode(10036);
        rtNY.setCountry("USA");
        Home lincolnNY=new Home(1998,"Broadway","New York","NY",10023,"USA");
        lincolnNY.setHomeNum(1998);
        lincolnNY.setHouseStreet("Broadway");
        lincolnNY.setLocal_area("New York");
        lincolnNY.setState("NY");
        lincolnNY.setZipcode(10023);
        lincolnNY.setCountry("USA");
        Home nyPlaza=new Home(2210,"Bartow Avenue","Bronx","NY",10475,"USA");
        nyPlaza.setHomeNum(2210);
        nyPlaza.setHouseStreet("Bartow Avenue");
        nyPlaza.setLocal_area("Bronx");
        nyPlaza.setState("NY");
        nyPlaza.setZipcode(10475);
        nyPlaza.setCountry("USA");
        Home rcNY=new Home(214,"E 161st St","Bronx","NY",10451,"USA");
        rcNY.setHomeNum(214);
        rcNY.setHouseStreet("E 161st St");
        rcNY.setLocal_area("Bronx");
        rcNY.setState("NY");
        rcNY.setZipcode(10451);
        rcNY.setCountry("USA");
        //More for New York
        Home amcEmpire = new Home(234, "W 42nd St", "New York", "NY", 10036, "USA");
        amcEmpire.setHomeNum(234);
        amcEmpire.setHouseStreet("W 42nd St");
        amcEmpire.setLocal_area("New York");
        amcEmpire.setState("NY");
        amcEmpire.setZipcode(10036);
        amcEmpire.setCountry("USA");
        Home angelikaFilm = new Home(18, "W Houston St", "New York", "NY", 10012, "USA");
        angelikaFilm.setHomeNum(18);
        angelikaFilm.setHouseStreet("W Houston St");
        angelikaFilm.setLocal_area("New York");
        angelikaFilm.setState("NY");
        angelikaFilm.setZipcode(10012);
        angelikaFilm.setCountry("USA");
        Home magicHarlem = new Home(2309, "Frederick Douglass Blvd", "Harlem", "NY", 10027, "USA");
        magicHarlem.setHomeNum(2309);
        magicHarlem.setHouseStreet("Frederick Douglass Blvd");
        magicHarlem.setLocal_area("Harlem");
        magicHarlem.setState("NY");
        magicHarlem.setZipcode(10027);
        magicHarlem.setCountry("USA");
        Home bamRose = new Home(30, "Lafayette Ave", "Brooklyn", "NY", 11217, "USA");
        bamRose.setHomeNum(30);
        bamRose.setHouseStreet("Lafayette Ave");
        bamRose.setLocal_area("Brooklyn");
        bamRose.setState("NY");
        bamRose.setZipcode(11217);
        bamRose.setCountry("USA");
        Home kewQueens = new Home(8105, "Lefferts Blvd", "Queens", "NY", 11415, "USA");
        kewQueens.setHomeNum(8105);
        kewQueens.setHouseStreet("Lefferts Blvd");
        kewQueens.setLocal_area("Queens");
        kewQueens.setState("NY");
        kewQueens.setZipcode(11415);
        kewQueens.setCountry("USA");
        Home stGeorgeSI = new Home(35, "Hyatt St", "Staten Island", "NY", 10301, "USA");
        stGeorgeSI.setHomeNum(35);
        stGeorgeSI.setHouseStreet("Hyatt St");
        stGeorgeSI.setLocal_area("Staten Island");
        stGeorgeSI.setState("NY");
        stGeorgeSI.setZipcode(10301);
        stGeorgeSI.setCountry("USA");
        //California Theaters
        Home chineseLA = new Home(6925, "Hollywood Blvd", "Los Angeles", "CA", 90028, "USA");
        chineseLA.setHomeNum(6925);
        chineseLA.setHouseStreet("Hollywood Blvd");
        chineseLA.setLocal_area("Los Angeles");
        chineseLA.setState("CA");
        chineseLA.setZipcode(90028);
        chineseLA.setCountry("USA");
        Home castroSF = new Home(429, "Castro St", "San Francisco", "CA", 94114, "USA");
        castroSF.setHomeNum(429);
        castroSF.setHouseStreet("Castro St");
        castroSF.setLocal_area("San Francisco");
        castroSF.setState("CA");
        castroSF.setZipcode(94114);
        castroSF.setCountry("USA");
        Home landmarkPas = new Home(673, "E Colorado Blvd", "Pasadena", "CA", 91101, "USA");
        landmarkPas.setHomeNum(673);
        landmarkPas.setHouseStreet("E Colorado Blvd");
        landmarkPas.setLocal_area("Pasadena");
        landmarkPas.setState("CA");
        landmarkPas.setZipcode(91101);
        landmarkPas.setCountry("USA");
        Home grandOak = new Home(3200, "Grand Ave", "Oakland", "CA", 94610, "USA");
        grandOak.setHomeNum(3200);
        grandOak.setHouseStreet("Grand Ave");
        grandOak.setLocal_area("Oakland");
        grandOak.setState("CA");
        grandOak.setZipcode(94610);
        grandOak.setCountry("USA");
        Home domeSJ = new Home(950, "S Winchester Blvd", "San Jose", "CA", 95128, "USA");
        domeSJ.setHomeNum(950);
        domeSJ.setHouseStreet("S Winchester Blvd");
        domeSJ.setLocal_area("San Jose");
        domeSJ.setState("CA");
        domeSJ.setZipcode(95128);
        domeSJ.setCountry("USA");
        Home towerSac = new Home(2508, "Land Park Dr", "Sacramento", "CA", 95818, "USA");
        towerSac.setHomeNum(2508);
        towerSac.setHouseStreet("Land Park Dr");
        towerSac.setLocal_area("Sacramento");
        towerSac.setState("CA");
        towerSac.setZipcode(95818);
        towerSac.setCountry("USA");
        Home balboaSD = new Home(1350, "El Prado", "San Diego", "CA", 92101, "USA");
        balboaSD.setHomeNum(1350);
        balboaSD.setHouseStreet("El Prado");
        balboaSD.setLocal_area("San Diego");
        balboaSD.setState("CA");
        balboaSD.setZipcode(92101);
        balboaSD.setCountry("USA");
        Home foxRiv = new Home(3801, "Riverside Dr", "Riverside", "CA", 92501, "USA");
        foxRiv.setHomeNum(3801);
        foxRiv.setHouseStreet("Riverside Dr");
        foxRiv.setLocal_area("Riverside");
        foxRiv.setState("CA");
        foxRiv.setZipcode(92501);
        foxRiv.setCountry("USA");
        Home arlingtonSB = new Home(1317, "State St", "Santa Barbara", "CA", 93101, "USA");
        arlingtonSB.setHomeNum(1317);
        arlingtonSB.setHouseStreet("State St");
        arlingtonSB.setLocal_area("Santa Barbara");
        arlingtonSB.setState("CA");
        arlingtonSB.setZipcode(93101);
        arlingtonSB.setCountry("USA");
        Home warnorsFres = new Home(2020, "Tuolumne St", "Fresno", "CA", 93721, "USA");
        warnorsFres.setHomeNum(2020);
        warnorsFres.setHouseStreet("Tuolumne St");
        warnorsFres.setLocal_area("Fresno");
        warnorsFres.setState("CA");
        warnorsFres.setZipcode(93721);
        warnorsFres.setCountry("USA");
        //Ohio Theaters
        Home palaceCle = new Home(1615, "Euclid Ave", "Cleveland", "OH", 44115, "USA");
        palaceCle.setHomeNum(1615);
        palaceCle.setHouseStreet("Euclid Ave");
        palaceCle.setLocal_area("Cleveland");
        palaceCle.setState("OH");
        palaceCle.setZipcode(44115);
        palaceCle.setCountry("USA");
        Home drexelCol = new Home(2254, "E Main St", "Columbus", "OH", 43209, "USA");
        drexelCol.setHomeNum(2254);
        drexelCol.setHouseStreet("E Main St");
        drexelCol.setLocal_area("Columbus");
        drexelCol.setState("OH");
        drexelCol.setZipcode(43209);
        drexelCol.setCountry("USA");
        Home esquireCin = new Home(320, "Ludlow Ave", "Cincinnati", "OH", 45220, "USA");
        esquireCin.setHomeNum(320);
        esquireCin.setHouseStreet("Ludlow Ave");
        esquireCin.setLocal_area("Cincinnati");
        esquireCin.setState("OH");
        esquireCin.setZipcode(45220);
        esquireCin.setCountry("USA");
        Home schusterDay = new Home(1, "W 2nd St", "Dayton", "OH", 45402, "USA");
        schusterDay.setHomeNum(1);
        schusterDay.setHouseStreet("W 2nd St");
        schusterDay.setLocal_area("Dayton");
        schusterDay.setState("OH");
        schusterDay.setZipcode(45402);
        schusterDay.setCountry("USA");
        Home valentineTol = new Home(410, "Adams St", "Toledo", "OH", 43604, "USA");
        valentineTol.setHomeNum(410);
        valentineTol.setHouseStreet("Adams St");
        valentineTol.setLocal_area("Toledo");
        valentineTol.setState("OH");
        valentineTol.setZipcode(43604);
        valentineTol.setCountry("USA");
        Home akronCivic = new Home(182, "S Main St", "Akron", "OH", 44308, "USA");
        akronCivic.setHomeNum(182);
        akronCivic.setHouseStreet("S Main St");
        akronCivic.setLocal_area("Akron");
        akronCivic.setState("OH");
        akronCivic.setZipcode(44308);
        akronCivic.setCountry("USA");
        Home kulasCan = new Home(1101, "Market Ave N", "Canton", "OH", 44702, "USA");
        kulasCan.setHomeNum(1101);
        kulasCan.setHouseStreet("Market Ave N");
        kulasCan.setLocal_area("Canton");
        kulasCan.setState("OH");
        kulasCan.setZipcode(44702);
        kulasCan.setCountry("USA");
        Home neonDayton = new Home(130, "E 5th St", "Dayton", "OH", 45402, "USA");
        neonDayton.setHomeNum(130);
        neonDayton.setHouseStreet("E 5th St");
        neonDayton.setLocal_area("Dayton");
        neonDayton.setState("OH");
        neonDayton.setZipcode(45402);
        neonDayton.setCountry("USA");
        Home nightlightAk = new Home(30, "N High St", "Akron", "OH", 44308, "USA");
        nightlightAk.setHomeNum(30);
        nightlightAk.setHouseStreet("N High St");
        nightlightAk.setLocal_area("Akron");
        nightlightAk.setState("OH");
        nightlightAk.setZipcode(44308);
        nightlightAk.setCountry("USA");
        Home gatewayCol = new Home(1550, "N High St", "Columbus", "OH", 43201, "USA");
        gatewayCol.setHomeNum(1550);
        gatewayCol.setHouseStreet("N High St");
        gatewayCol.setLocal_area("Columbus");
        gatewayCol.setState("OH");
        gatewayCol.setZipcode(43201);
        gatewayCol.setCountry("USA");
        //Theater Objects
        Theater ExMovieTav = new Theater("Exton Movie Tavern", CinUno);
        Theater DowntownRegal = new Theater("Regal Downingtown", REGAL);
        Theater Wilm = new Theater("AMC DINE-IN Painters Crossing 9", Wilm1);
        Theater kingOPrussiaTheater = new Theater("Regal UA King Of Prussia", KOP1);
        Theater PhillyTav = new Theater("Cinemark University City Penn 6", C2inCo);
        Theater WCU = new Theater("Pennsylvania Theatre Institute at West Chester University", Theatre);
        Theater Delsiete = new Theater("Regal Brandywine Town Center", DelSpot);
        Theater HometownArts = new Theater("SALT Performing Arts | West Chester", perfomers);
        Theater CapitalStateProductions = new Theater("UEC Theatres 12", PENNSTATEFILMS);
        Theater otherPenn = new Theater("College 9 Theatre", C9T);
        Theater SymphonySpace=new Theater("Symphony Space",symphonySpace);
        Theater RegalTimesSquare=new Theater("Regal Times Square",rtNY);
        Theater AMCLincolnSquare13=new Theater("Lincoln Square 13",lincolnNY);
        Theater AMCBayPlaza13=new Theater("AMC Bay Plaza Cinema 13",nyPlaza);
        Theater RegalConcourse=new Theater("Regal Concourse",rcNY);
        Theater amcEmpireNY=new Theater("AMC Empire 25",amcEmpire);
        Theater AngelicaFilmCenter=new Theater("Angelika Film Center & Cafe - New York",angelikaFilm);
        Theater magicHarlemCity=new Theater("AMC Magic Johnson Harlem 9",magicHarlem);
        Theater bamRoseBrooklyn=new Theater("BAM Rose Cinemas",bamRose);
        Theater kewGardens=new Theater("Kew Gardens Cinemas",kewQueens);
        Theater stGeorgeStateIsland=new Theater("St. George Theatre",stGeorgeSI);
        Theater ChineseTheaterLA = new Theater("TCL Chinese Theatre", chineseLA);
        Theater CastroTheaterSF = new Theater("Castro Theatre", castroSF);
        Theater LandmarkPasadena = new Theater("Landmark Pasadena", landmarkPas);
        Theater GrandLakeOakland = new Theater("Grand Lake Theatre", grandOak);
        Theater WinchesterDomeSJ = new Theater("Winchester Drive-In", domeSJ);
        Theater TowerSacramento = new Theater("Tower Theatre", towerSac);
        Theater BalboaSanDiego = new Theater("Balboa Theatre", balboaSD);
        Theater FoxRiverside = new Theater("Fox Performing Arts Center", foxRiv);
        Theater ArlingtonSB = new Theater("Arlington Theatre", arlingtonSB);
        Theater WarnorsFresno = new Theater("Warnors Theatre", warnorsFres);
        Theater PalaceCleveland = new Theater("Playhouse Square - Palace Theatre", palaceCle);
        Theater DrexelColumbus = new Theater("Drexel Theatre", drexelCol);
        Theater EsquireCincinnati = new Theater("Esquire Theatre", esquireCin);
        Theater SchusterDayton = new Theater("Schuster Performing Arts Center", schusterDay);
        Theater ValentineToledo = new Theater("Valentine Theatre", valentineTol);
        Theater AkronCivicTheater = new Theater("Akron Civic Theatre", akronCivic);
        Theater KulasCanton = new Theater("Kulas Auditorium", kulasCan);
        Theater NeonDayton = new Theater("The NEON", neonDayton);
        Theater NightlightAkron = new Theater("The Nightlight Cinema", nightlightAk);
        Theater GatewayColumbus = new Theater("Gateway Film Center", gatewayCol);
        availableTheaters.addAll(ExMovieTav, DowntownRegal, Wilm, kingOPrussiaTheater, PhillyTav, WCU, Delsiete, HometownArts, CapitalStateProductions, otherPenn);
        availableTheaters.addAll(SymphonySpace,RegalTimesSquare,AMCLincolnSquare13,AMCBayPlaza13,RegalConcourse,amcEmpireNY,AngelicaFilmCenter,magicHarlemCity,bamRoseBrooklyn,kewGardens,stGeorgeStateIsland);
        availableTheaters.addAll(ChineseTheaterLA, CastroTheaterSF, LandmarkPasadena, GrandLakeOakland, WinchesterDomeSJ, TowerSacramento, BalboaSanDiego, FoxRiverside, ArlingtonSB, WarnorsFresno);
        availableTheaters.addAll(PalaceCleveland, DrexelColumbus, EsquireCincinnati, SchusterDayton, ValentineToledo, AkronCivicTheater, KulasCanton, NeonDayton, NightlightAkron, GatewayColumbus);
        USA_Theaters.setItems(availableTheaters);
    }
    @FXML
    void view_Account() { //We are going to either Create an Account,or Log in.
        login.setVisible(false);
        btn_BookTicket.setVisible(false);
        btn_ConfirmTicket.setVisible(false);
        btn_EditTicket.setVisible(false);
        btn_FoodMenu.setVisible(false);
        btn_LocalTheaters.setVisible(false);
        message.setVisible(false);
        //Creating new Buttons for the user
        btn_CreateAcc.setVisible(true);
        btn_AddNew.setVisible(true);
        btnEdit.setVisible(true);
        btn_CreateAcc.setLayoutX(49);
        btn_CreateAcc.setLayoutY(660);
        user_FName.setVisible(true);
        user_MName.setVisible(true);
        user_LName.setVisible(true);
        user_Age.setVisible(true);
        user_resNumber.setVisible(true);
        user_Street.setVisible(true);
        user_City.setVisible(true);
        user_State.setVisible(true);
        user_Zip.setVisible(true);
        user_Country.setVisible(true);
        userName.setVisible(true);
        cus_password.setVisible(true);
        critOne.setVisible(true);
        critTwo.setVisible(true);
        firstN=user_FName.getText();
        middleN=user_MName.getText();
        lastN=user_LName.getText();
        Age=Integer.parseInt(user_Age.getText());
        homeNum=Integer.parseInt(user_resNumber.getText());
        street=user_Street.getText();
        city=user_City.getText();
        state=user_State.getText();
        zipcode=Integer.parseInt(user_Zip.getText());
        country=user_Country.getText();
        cus_cred1=userName.getText();
        cus_cred2=cus_password.getText();
    }
    @FXML
    void view_ConcessionStand() {

    }
    @FXML
    void view_Credits() {

    }
    @FXML
    void view_LocalTheaters() { //Going to search for local theaters around
        login.setText("Sign in");
        login.setVisible(true);
        login.setLayoutX(35);
        login.setLayoutY(350);
        btn_BookTicket.setVisible(false);
        btn_ConfirmTicket.setVisible(false);
        btn_EditTicket.setVisible(false);
        btn_FoodMenu.setVisible(false);
        btn_LocalTheaters.setVisible(false);
        message.setText("Login");
        message.setVisible(true);
        message.setLayoutX(35);
        message.setLayoutY(20);
        critOne.setVisible(true);
        critOne.setLayoutX(35);
        critOne.setLayoutY(155);
        critTwo.setVisible(true);
        critTwo.setLayoutX(35);
        critTwo.setLayoutY(220);
        Theaters_val.setVisible(true);
        Theaters_val.setLayoutX(35);
        Theaters_val.setLayoutY(285);
        cus_credA=critOne.getText();
        cus_credB=critTwo.getText();
        num= Integer.valueOf(Theaters_val.getText());
    }
    @FXML
    void access(){
        view_LocalTheaters();
        //Task will be to check if the userName and the Password are recognized in the ListViews.
        boolean Found=false;
        String cityName;
        String headCity = "";
        allKids.setLayoutY(30);
        allKids.setVisible(true);
        over18.setLayoutY(200);
        over18.setVisible(true);
        while(Found==false){
            for(Person p:totalPatrons.getAdultsDatabase()){
                if(p instanceof Adult && p.getUserName().equalsIgnoreCase(cus_credA) && p.getPassword().equalsIgnoreCase(cus_credB)){ //Just like we login,both userName and password need to be exactly the same.
                    System.out.println("We recognize the adult signing in,"+p.getCus_fName()+" "+p.getCus_mName()+" "+p.getCus_lName());
                    cityName=p.getResidence().getLocal_area();
                    headCity=cityName;
                    critOne.clear();
                    critTwo.clear();
                    Theaters_val.clear();
                    critOne.setVisible(false);
                    critTwo.setVisible(false);
                    Theaters_val.setVisible(false);
                    Found=true;
                }
                else{ //If the username and Password do not match with their sign-up credentials
                    System.out.println("Checking for adult with username "+cus_credA+"...");
                    critOne.clear();
                    critTwo.clear();
                    Theaters_val.clear();
                    Found=false;
                }
            }
            //Task 11/11:We need to make the same things yield true for the Children Section
            for(Person p:totalPatrons.getChildrenDatabase()){
                if(p.getUserName().equalsIgnoreCase(cus_credA) && p.getPassword().equalsIgnoreCase(cus_credB)){ //Just like we login,both userName and password need to be exactly the same.
                    System.out.println("We recognize the child signing in,"+p.getCus_fName()+" "+p.getCus_mName()+" "+p.getCus_lName());
                    cityName=p.getResidence().getCountry();
                    headCity=cityName;
                    critOne.clear();
                    critTwo.clear();
                    Theaters_val.clear();
                    critOne.setVisible(false);
                    critTwo.setVisible(false);
                    Theaters_val.setVisible(false);
                    Found=true;
                }
                else{ //If the username and Password do not match with their sign-up credentials
                    System.out.println("Checking for child with username "+cus_credA+"...");
                    critOne.clear();
                    critTwo.clear();
                    Theaters_val.clear();
                    Found=false;
                }
            }
        }
        //January 20:Beta layout detailing only the theaters in United States of America
        message.setText("Searching for the nearest "+num+" Theaters in "+headCity);
        message.setLayoutX(80);
        message.setLayoutY(350);
        message.setVisible(true);
        //Task Feb 2:Generate a random list of theaters that ALIGN with the user's city(retrieves from the database);
        ArrayList<Theater> suitableTheaters=new ArrayList<>();
        boolean add=false;
        for (Theater mT: USA_Theaters.getItems()){
            if(mT.getLocation().getLocal_area()==headCity){
                add=true;
                suitableTheaters.add(mT);
            }
            else{
                add=false;
            }
        }
    }
    @FXML
    void book_Ticket() {
        //February 13 Start:Start creating the scheme to book the ticket.
        critOne.setVisible(true);
        critOne.setLayoutX(35);
        critOne.setLayoutY(155);
        critTwo.setVisible(true);
        critTwo.setLayoutX(35);
        critTwo.setLayoutY(220);
        cus_credA=critOne.getText();
        cus_credB=critTwo.getText();
    }
    @FXML
    void modify_TixStat() {

    }
    @FXML
    void Confirm_Ticket() {

    }
    @FXML
    void conf_Edit(){
        Person cus=Customers_View.getSelectionModel().getSelectedItem();
        Customers_View.setVisible(false);
        //In case the user changes their information;
        if(!user_FName.getText().isEmpty()){
            cus.setCus_firstName(user_FName.getText());
        }
        if(!user_MName.getText().isEmpty()){
            cus.setCus_mName(user_MName.getText());
        }
        if(!user_LName.getText().isEmpty()){
            cus.setCus_lName(user_LName.getText());
        }
        if(!user_resNumber.getText().isEmpty()){
            cus.getResidence().setHomeNum(Integer.parseInt(user_resNumber.getText()));
        }
        if(!user_Street.getText().isEmpty()){
            cus.getResidence().setHouseStreet(user_Street.getText());
        }
        if(!user_City.getText().isEmpty()){
            cus.getResidence().setLocal_area(user_City.getText());
        }
        if(!user_State.getText().isEmpty()){
            cus.getResidence().setState(user_State.getText());
        }
        if(!user_Zip.getText().isEmpty()){
            cus.getResidence().setZipcode(Integer.parseInt(user_Zip.getText()));
        }
        if(!user_Country.getText().isEmpty()){
            cus.getResidence().setCountry(user_Country.getText());
        }
        message.setText("Updated information!");
        message.setVisible(true);
        System.out.println("3...2...1...");
        message.setVisible(false);
        //And then we will clear all since we have already updated the customer credentials;
        user_FName.clear();
        user_MName.clear();
        user_LName.clear();
        user_Age.clear();
        user_resNumber.clear();
        user_Street.clear();
        user_City.clear();
        user_State.clear();
        user_Zip.clear();
        user_Country.clear();
        userName.clear();
        cus_password.clear();
        //After user created their account,we are to take them back to the home screen
        btn_Account.setVisible(true);
        btn_BookTicket.setVisible(true);
        btn_ConfirmTicket.setVisible(true);
        btn_Credits.setVisible(true);
        btn_EditTicket.setVisible(true);
        btn_FoodMenu.setVisible(true);
        btn_LocalTheaters.setVisible(true);
        //Creating our Images for the start scene;
        user_FName.setVisible(false);
        user_MName.setVisible(false);
        user_LName.setVisible(false);
        user_Age.setVisible(false);
        user_resNumber.setVisible(false);
        user_Street.setVisible(false);
        user_City.setVisible(false);
        user_State.setVisible(false);
        user_Zip.setVisible(false);
        user_Country.setVisible(false);
        userName.setVisible(false);
        cus_password.setVisible(false);
        btn_CreateAcc.setVisible(false);
        userName_notify.setVisible(false);
        btn_AddNew.setVisible(false);
        btnEdit.setVisible(false);
        critOne.setVisible(false);
        critTwo.setVisible(false);
        btnedit.setVisible(false);
    }
    @FXML
    void edit_Acc(){
        btn_BookTicket.setVisible(false);
        btn_ConfirmTicket.setVisible(false);
        btn_EditTicket.setVisible(false);
        btn_FoodMenu.setVisible(false);
        btn_LocalTheaters.setVisible(false);
        message.setVisible(false);
        btn_CreateAcc.setVisible(false);
        //Creating new Buttons for the user
        btn_AddNew.setVisible(true);
        btnEdit.setVisible(true);
        btnedit.setVisible(true);
        btnedit.setLayoutX(49);
        btnedit.setLayoutY(660);
        user_FName.setVisible(true);
        user_MName.setVisible(true);
        user_LName.setVisible(true);
        user_Age.setVisible(true);
        user_resNumber.setVisible(true);
        user_Street.setVisible(true);
        user_City.setVisible(true);
        user_State.setVisible(true);
        user_Zip.setVisible(true);
        user_Country.setVisible(true);
        userName.setVisible(true);
        cus_password.setVisible(true);
        //Revision 9/17:We will use a search authenticator first for the user to find themselves;
        cus_credA=critOne.getText();
        cus_credB=critTwo.getText();
        critOne.clear();
        critTwo.clear();
        //Now we will search for the exact customer in the ListView provided the information;
        for(Person cus:allPatrons){
            if (cus.getUserName().equals(cus_credA) && cus.getPassword().equals(cus_credB)) {
                user_FName.setText(cus.getCus_fName());
                user_MName.setText(cus.getCus_mName());
                user_LName.setText(cus.getCus_lName());
                user_Age.setText(Integer.toString(cus.getCus_Age()));
                user_resNumber.setText(Integer.toString(cus.getResidence().getHouseNumber()));
                user_Street.setText(cus.getResidence().getHouseStreet());
                user_City.setText(cus.getResidence().getLocal_area());
                user_State.setText(cus.getResidence().getState());
                user_Zip.setText(Integer.toString(cus.getResidence().getZipcode()));
                user_Country.setText(cus.getResidence().getCountry());
                userName.setText(cus.getUserName());
                cus_password.setText(cus.getPassword());
            }
        }
        Customers_View.setVisible(true);
    }
    @FXML
    void add_Acc(){
        create_Acc(); //We are replicating the same process for the user's convenience.
        System.out.println("Another account for the user has been created");
    }
    //Inner buttons for our Main tasks
    @FXML
    void create_Acc(){
        view_Account();
        //Store the customer's address here,set all the variables;
        //Task here is to create an account for our Client(s)--Polymorphism needed to group the person appropriately(as a child,adult)
        if(Float.parseFloat(user_Age.getText())<18){
            c1=new Child(firstN,middleN,lastN,Age,address,cus_cred1,cus_cred2);
        }
        else if(Float.parseFloat(user_Age.getText())>=18){
            c1=new Adult(firstN,middleN,lastN,Age,address,cus_cred1,cus_cred2);
        }
        else if(Float.parseFloat(user_Age.getText())<0){
            System.out.println("Invalid Age!Please try again or exit this screen");
        }
        //Setting every variable in the customer class
        c1.setCus_firstName(firstN);
        if(middleN.isEmpty()){
            c1.setCus_mName("");
        }
        else{
            c1.setCus_mName(middleN);
        }
        c1.setCus_lName(lastN);
        c1.setCus_Age(Age);
        address=new Home(homeNum,street,city,state,zipcode,country);
        address.setHomeNum(homeNum);
        address.setHouseStreet(street);
        address.setLocal_area(city);
        address.setState(state);
        address.setZipcode(zipcode);
        address.setCountry(country);
        c1.setResidence(address);
        c1.getResidence().setHomeNum(homeNum);
        c1.getResidence().setHouseStreet(street);
        c1.getResidence().setLocal_area(city);
        c1.getResidence().setState(state);
        c1.getResidence().setZipcode(zipcode);
        c1.getResidence().setCountry(country);
        c1.setUserName(cus_cred1);
        c1.setPassword(cus_cred2);
        //After we set everything,we should add c1 into the Patrons class;
        allPatrons.add(c1);
        Customers_View.setItems(allPatrons);
        //November 3:We are now going to work with our newly created ListViews,ObservableViews,and Array Lists;
        //totalPatrons,in both cases--is the Backend interface of the app where our Children and/or Adults coincide for Owner access;
        if(c1 instanceof Child){
            totalPatrons.addChild((Child)c1);
            totalPatrons.setChildrenDatabase(children);
            youngsters.add((Child)c1);
            allKids.setItems(youngsters);
            child_GroupView.setText(totalPatrons.List_Ofchildren());
            System.out.println("We have updated the allKids list successfully with the new one added.");
        }
        else if(c1 instanceof Adult){
            totalPatrons.addAdult((Adult)c1);
            totalPatrons.setAdultsDatabase(adults);
            olderOnes.add((Adult)c1);
            over18.setItems(olderOnes); //Need to append our updates OlderOnes ObservableList into the over18;
            adult_GroupView.setText(totalPatrons.List_OfAdults());
            System.out.println("We have updated the over18 list successfully with the new one added.");
        }
        System.out.println("Customer has been stored into the database!");
        user_FName.clear();
        user_MName.clear();
        user_LName.clear();
        user_Age.clear();
        user_resNumber.clear();
        user_Street.clear();
        user_City.clear();
        user_State.clear();
        user_Zip.clear();
        user_Country.clear();
        userName.clear();
        cus_password.clear();
        //After user created their account,we are to take them back to the home screen
        btn_Account.setVisible(true);
        btn_BookTicket.setVisible(true);
        btn_ConfirmTicket.setVisible(true);
        btn_Credits.setVisible(true);
        btn_EditTicket.setVisible(true);
        btn_FoodMenu.setVisible(true);
        btn_LocalTheaters.setVisible(true);
        //Creating our Images for the start scene;
        user_FName.setVisible(false);
        user_MName.setVisible(false);
        user_LName.setVisible(false);
        user_Age.setVisible(false);
        user_resNumber.setVisible(false);
        user_Street.setVisible(false);
        user_City.setVisible(false);
        user_State.setVisible(false);
        user_Zip.setVisible(false);
        user_Country.setVisible(false);
        userName.setVisible(false);
        cus_password.setVisible(false);
        btn_CreateAcc.setVisible(false);
        userName_notify.setVisible(false);
        btn_AddNew.setVisible(false);
        btnEdit.setVisible(false);
    }
}
