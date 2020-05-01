package legoset;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.net.URL;
import java.time.Year;
import java.util.List;

import jaxb.JAXBHelper;
public class LegoSet {
    java.time.Year year;
    int peices;
    java.util.Set<String> tags;
    java.util.List<Minifig> minifigs;
    private String name;
    private String theme;
    private String subtheme;


    public static void main(String[] args) throws Exception {
        LegoSet legoSet = new LegoSet();
        legoSet.setname("Imperial TIE Fighter");
        legoSet.settheme("Star Wars");
        legoSet.setsubtheme("Solo");
        legoSet.setyear(Year.of(2018));
        legoSet.setpeices(519);
        legoSet.setminifigs();
        legoSet.settags(List.of("Starfighter", "stormtrooper", "Wars","Solo"));


        JAXBHelper.toXML(legoSet, System.out);

        JAXBHelper.toXML(legoSet, new FileOutputStream("legoset.xml"));
        System.out.println(JAXBHelper.fromXML(LegoSet.class, new FileInputStream("legoset.xml")));
    }

    private void name(String imperial_tie_fighter) {
    }

}
