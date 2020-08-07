/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safechat;

/**
 *
 * @author iZooGooD
 */
public class Encryption {
    
    
    public static String decript(String op)
    {
        String ss = op ;   
        String os = "" ;
     
        String strMain = ss;
        String[] chars = strMain.split("Æ");
    for (int i=0; i < chars.length; i++)
    {
           String s = String.valueOf(chars[i]);
           
                
        if("12@55@".equals(s)||"a".equals(s))
        {
            os = os +"a";            
        }
        else if("74@84@".equals(s)||"b".equals(s) )
        {
            os = os +"b";
        }
        else if("89@18@15@".equals(s)||"c".equals(s) )
        {
            os = os +"c";
        }
        else if("24@94@67@36@".equals(s)||"d".equals(s) )
        {
            os = os +"d";
        }
        else if("67@55@".equals(s)||"e".equals(s) )
        {
            os = os +"e";
        }
        else if("254@1987@".equals(s)||"f".equals(s) )
        {
            os = os +"f";
        }
        else if("61@924@".equals(s)||"g".equals(s) )
        {
            os = os +"g";
        }
        else if("22@73@91@".equals(s)||"h".equals(s) )
        {
            os = os +"h";
        }
        else if("26@49@57@".equals(s)||"i".equals(s) )
        {
            os = os +"i";
        }
        else if("96@41@81@".equals(s)||"j".equals(s) )
        {
            os = os +"j";
        }
        else if("76@84@61@".equals(s)||"k".equals(s) )
        {
            os = os +"k";
        }
        else if("13@31@313@".equals(s)||"l".equals(s) )
        {
            os = os +"l";
        }
        else if("26@13@78@78@".equals(s)||"m".equals(s) )
        {
            os = os +"m";
        }
        else if("44@55@14@95@@".equals(s)||"n".equals(s) )
        {
            os = os +"n";
        }
        else if("81@14@17@26@".equals(s)||"o".equals(s) )
        {
            os = os +"o";
        }
        else if("82@45@78@64@".equals(s)||"p".equals(s) )
        {
            os = os +"p";
        }
        else if("56@57@43@58@".equals(s)||"q".equals(s) )
        {
            os = os +"q";
        }
        else if("29@54@28@99@45@".equals(s)||"r".equals(s) )
        {
            os = os +"r";
        }
        else if("41@54@77@87@15@11@".equals(s)||"s".equals(s) )
        {
            os = os +"s";
        }
        else if("15@89@41@61@".equals(s)||"t".equals(s) )
        {
            os = os +"t";
        }
        else if("23@71@182@96@67@45@".equals(s)||"u".equals(s) )
        {
            os = os +"u";
        }
        else if("89@16@72@25@".equals(s)||"v".equals(s) )
        {
            os = os +"v";
        }
        else if("42@95@58@69@44@85@".equals(s)||"w".equals(s) )
        {
            os = os +"w";
        }
        else if("22@@11@@44@@".equals(s)||"x".equals(s) )
        {
            os = os +"x";
        }
        else if("19@59@65@".equals(s)||"y".equals(s) )
        {
            os = os +"y";
        }
        else if("22@28@56@64@".equals(s)||"z".equals(s) )
        {
            os = os +"z";
        }
        else if("7@4@1@8@5@2".equals(s))
        {
          
            os = os +" ";
        }
        if("12@245162@@52@5@55@".equals(s))
        {
            os = os +"A";            
        }
        else if("74@45@2@@@@@@@5@454@84@".equals(s))
        {
            os = os +"B";
        }
        else if("8@554@1@2@14@21@49@18@15@".equals(s))
        {
            os = os +"C";
        }
        else if("24@94@67@28@2569@4@5@125@@@52641@@@@251@@@5145@36@".equals(s))
        {
            os = os +"D";
        }
        else if("654@52@5225@25@57@55@".equals(s))
        {
            os = os +"E";
        }
        else if("254@1@@25@5@5@824847@987@".equals(s))
        {
            os = os +"F";
        }
        else if("23@6@@@5@@12@2@56@25@61@924@".equals(s))
        {
            os = os +"G";
        }
        else if("2@2@5@2@252@5@222@73@91@".equals(s))
        {
            os = os +"H";
        }
        else if("225@5@@1242@@1@@@@25445@@@@98776@49@57@".equals(s))
        {
            os = os +"I";
        }
        else if("96@41@2@6@4@7@9@81@".equals(s))
        {
            os = os +"J";
        }
        else if("76@8@2@5@4@25@@661@".equals(s))
        {
            os = os +"K";
        }
        else if("1@1@2@7@8@99@9@93@31@313@".equals(s))
        {
            os = os +"L";
        }
        else if("2@22@2@5@@3@8@5@6@13@78@78@".equals(s))
        {
            os = os +"M";
        }
        else if("44@@5@5@1@4@@95@@".equals(s))
        {
            os = os +"N";
        }
        else if("81@2@1@3@6@@26@@14@17@26@".equals(s))
        {
            os = os +"O";
        }
        else if("82@@45@@7@@@62@4@1@4@61@2@7@4@5@9@9@6@5@@3@5@424@".equals(s))
        {
            os = os +"P";
        }
        else if("5@6@@52@13@46@12@4@51@4@3@5627@43@58@".equals(s))
        {
            os = os +"Q";
        }
        else if("2@9@@2@54@25@54@5@56@54@28@99@45@".equals(s))
        {
            os = os +"R";
        }
        else if("1@41@4@619@758@64@975@864@35@15@48@82@54@77@87@15@11@".equals(s))
        {
            os = os +"S";
        }
        else if("@@2@1@5@24@5@2@2@1215@89@41@61@".equals(s))
        {
            os = os +"T";
        }
        else if("@2@4@5@13@6@52@1@6@3@2@6@15@42@5323@71@182@96@67@45@".equals(s))
        {
            os = os +"U";
        }
        else if("@2@5@6@2@5189@16@72@25@".equals(s))
        {
            os = os +"V";
        }
        else if("@1@2@52@51@25@42@52@4542@95@58@69@44@85@".equals(s))
        {
            os = os +"W";
        }
        else if("@2@14@2@14@@3@65@23622@@11@@44@@".equals(s))
        {
            os = os +"X";
        }
        else if("@@32@63@25@89@65@74@5819@59@65@".equals(s))
        {
            os = os +"Y";
        }
        else if("@2@@41@25@89@68@53@25@63@25@4722@28@56@64@".equals(s))
        {
            os = os +"Z";
        }
        else if("756@2584@6931@4528@3695@14521@2".equals(s))
        {
           
            os = os +"1";
        }
        else if("7965@41452@13578@63258@4585@98752".equals(s))
        {
         
            os = os +"2";
        }
        else if("1247@23694@2561@3248@69855@2452".equals(s))
        {
         
            os = os +"3";
        }
        else if("45237@9684@45631@25898@96585@2".equals(s))
        {
         
            os = os +"4";
        }
        else if("79865@42356@14578@86356@51254@8522".equals(s))
        {
         
            os = os +"5";
        }
        else if("8527@4564@98511@73918@52525@2".equals(s))
        {
         
            os = os +"6";
        }
        else if("9117@114@111@45698@7545@2".equals(s))
        {
         
            os = os +"7";
        }
        else if("6596327@46542@135689@865214@5@2".equals(s))
        {
         
            os = os +"8";
        }
        else if("76363@4254@17854@862149@5@2".equals(s))
        {
         
            os = os +"9";
        }
        else if("7458@445@1247@86359@58524@2".equals(s))
        {
         
            os = os +"0";
        }
        else if("25@20@104@@9994@6457@3786@".equals(s))
        {
            os = os +"@";
        }
        else if("295@625@9764512@@34615@@965@@@@457@3786@".equals(s))
        {
            os = os +".";
        }
        else if("11@@96@45@36@8452@1245@36589@".equals(s))
        {
            os = os +"!";
        }
        else if("96@495@@24@@369@@451@@9162@@2@1245@36589@".equals(s))
        {
            os = os +"#";
        }
        else if("9@@6@495@@24@@369@74@@5126@@3425@@4141@@2365@@98@@5@36589@".equals(s))
        {
            os = os +"$";
        }
        else if("9@96@@3546@4@@625@354@@525@41@@2365@@98@@5@36589@".equals(s))
        {
            os = os +"%";
        }
        else if("9@7@@@84@56@2451@@3467@5@89@@5@@61@@34256@@@491@35@614@@6@@@1".equals(s))
        {
            os = os +"^";
        }
        else if("1@2@45@24@35@61@24@578@49@16@45@1@34@5".equals(s))
        {
            os = os +"&";
        }
        else if("95@@625@6254@1212@14@155@".equals(s))
        {
            os = os +"*";
        }
        else if("6@4@315@421@63@457@849@16@43@561@542@78@49@161@345@7@67@45".equals(s))
        {
            os = os +"(";
        }
        else if("6@4@315@421@6911@457@849@16@03@561@542@78@49@161@345@7@67@45".equals(s))
        {
            os = os +")";
        }
        else if("@521@@@@214@5@2@5@5@6@@@62@@561@542@78@49@161@345@7@67@45".equals(s))
        {
            os = os +"-";
        }
        else if("6@@89@24@156@324@2@@@@412@45@45".equals(s))
        {
            os = os +"_";
        }
        else if("8@625@22@12@42@524@6325@545@84@56@624@62@625@4@532@".equals(s))
        {
            os = os +"+";
        }
        else if("852@455@5@5@5@4@2@1@6@6@5@".equals(s))
        {
            os = os +"=";
        }
        else if("852@455@556@5@5@4@2@1@6@6@5@".equals(s))
        {
            os = os +"`";
        }
        else if("852@455@5@5@5@4@2@6424251@6@6@5@".equals(s))
        {
            os = os +"~";
        }
        else if("8@6@59@45@16@23@56@79@48@15@64@32@5@12".equals(s))
        {
            os = os +"{";
        }
        else if("7@8@457@849@164@5@625@124@526@53@61@6@24@5@".equals(s))
        {
            os = os +"[";
        }
        else if("911@61@6@24@5@".equals(s))
        {
            os = os +"}";
        }
        else if("786@5@124@526@53@61@6@24@5@".equals(s))
        {
            os = os +"]";
        }
        else if("786@5@@@852654@@254@@61@6@24@5@".equals(s))
        {
            os = os +"|";
        }
        else if("69@355@5@@56@4@25@6@24@5@".equals(s))
        {
            os = os +"\\";
        }
        else if("85@2@2@3@65@42@15@63@2@59@86@5@32@6@24@5@".equals(s))
        {
            os = os +":";
        }
        else if("7@4@58@6@2@5@32@36@52@36@523@24@5@".equals(s))
        {
            os = os +";";
        }
        else if("9@65@86@32@54@125636@53@61@6@24@5@".equals(s))
        {
            os = os +"\"";
        }
        else if("845236515@@15@1521@@@1@25@".equals(s))
        {
            os = os +"<";
        }
        else if("8@@55@864@215@436@79@48@15@46@352@615@4251@6@24@5@".equals(s))
        {
            os = os +">";
        }
        else if("7@2@36@5256@5@124@526@53@61@6@24@5@".equals(s))
        {
            os = os +"?";
        }
        else if("786@5@124@@50@12@3@65@2365226@53@61@6@24@5@".equals(s))
        {
            os = os +",";
        }
        else if("78@6@9@5@3@5@6@98@562@61@6@24@5@".equals(s))
        {
            os = os +"/";
        }
        else if("8@52@56@32@41@25@63@25@41@26@35@245@24@5@".equals(s))
        {
            os = os +"'";
        }       
     }
        return(os);
    };

public static String encript(String op)
    {
        
        String ss = op ;   
        String os = "" ;
    
       // String ss = t1.getText();
           ss = ss.replaceAll("\\s+","é");
          char[] chars = ss.toCharArray();
        // String s = String.valueOf(chars);
       // s = String.valueOf(chars[1]);
          
       // l1.setText(s);
            
        for(int i=0 ; i< chars.length; i++)
        {
           
           String s = String.valueOf(chars[i]);
           
        if("a".equals(s))
        {
            os = os + "12@55@Æ";            
        }
        else if("b".equals(s))
        {
            os = os +"74@84@Æ";
        }
        else if("c".equals(s) )
        {
            os = os +"89@18@15@Æ";
        }
        else if("d".equals(s) )
        {
            os = os +"24@94@67@36@Æ";
        }
        else if("e".equals(s) )
        {
            os = os +"67@55@Æ";
        }
        else if("f".equals(s) )
        {
            os = os +"254@1987@Æ";
        }
        else if("g".equals(s) )
        {
            os = os +"61@924@Æ";
        }
        else if("h".equals(s) )
        {
            os = os +"22@73@91@Æ";
        }
        else if("i".equals(s) )
        {
            os = os +"26@49@57@Æ";
        }
        else if("j".equals(s) )
        {
            os = os +"96@41@81@Æ";
        }
        else if("k".equals(s) )
        {
            os = os +"76@84@61@Æ";
        }
        else if("l".equals(s) )
        {
            os = os +"13@31@313@Æ";
        }
        else if("m".equals(s) )
        {
            os = os +"26@13@78@78@Æ";
        }
        else if("n".equals(s) )
        {
            os = os +"44@55@14@95@@Æ";
        }
        else if("o".equals(s) )
        {
            os = os +"81@14@17@26@Æ";
        }
        else if("p".equals(s) )
        {
            os = os +"82@45@78@64@Æ";
        }
        else if("q".equals(s) )
        {
            os = os +"56@57@43@58@Æ";
        }
        else if("r".equals(s) )
        {
            os = os +"29@54@28@99@45@Æ";
        }
        else if("s".equals(s) )
        {
            os = os +"41@54@77@87@15@11@Æ";
        }
        else if("t".equals(s) )
        {
            os = os +"15@89@41@61@Æ";
        }
        else if("u".equals(s) )
        {
            os = os +"23@71@182@96@67@45@Æ";
        }
        else if("v".equals(s) )
        {
            os = os +"89@16@72@25@Æ";
        }
        else if("w".equals(s) )
        {
            os = os +"42@95@58@69@44@85@Æ";
        }
        else if("x".equals(s) )
        {
            os = os +"22@@11@@44@@Æ";
        }
        else if("y".equals(s) )
        {
            os = os +"19@59@65@Æ";
        }
        else if("z".equals(s) )
        {
            os = os +"22@28@56@64@Æ";
        }
        if("A".equals(s))
        {
            os = os +"12@245162@@52@5@55@Æ";            
        }
        else if("B".equals(s))
        {
            os = os +"74@45@2@@@@@@@5@454@84@Æ";
        }
        else if("C".equals(s))
        {
            os = os +"8@554@1@2@14@21@49@18@15@Æ";
        }
        else if("D".equals(s))
        {
            os = os +"24@94@67@28@2569@4@5@125@@@52641@@@@251@@@5145@36@Æ";
        }
        else if("E".equals(s))
        {
            os = os +"654@52@5225@25@57@55@Æ";
        }
        else if("F".equals(s))
        {
            os = os +"254@1@@25@5@5@824847@987@Æ";
        }
        else if("G".equals(s))
        {
            os = os +"23@6@@@5@@12@2@56@25@61@924@Æ";
        }
        else if("H".equals(s))
        {
            os = os +"2@2@5@2@252@5@222@73@91@Æ";
        }
        else if("I".equals(s))
        {
            os = os +"225@5@@1242@@1@@@@25445@@@@98776@49@57@Æ";
        }
        else if("J".equals(s))
        {
            os = os +"96@41@2@6@4@7@9@81@Æ";
        }
        else if("K".equals(s))
        {
            os = os +"76@8@2@5@4@25@@661@Æ";
        }
        else if("L".equals(s))
        {
            os = os +"1@1@2@7@8@99@9@93@31@313@Æ";
        }
        else if("M".equals(s))
        {
            os = os +"2@22@2@5@@3@8@5@6@13@78@78@Æ";
        }
        else if("N".equals(s))
        {
            os = os +"44@@5@5@1@4@@95@@Æ";
        }
        else if("O".equals(s))
        {
            os = os +"81@2@1@3@6@@26@@14@17@26@Æ";
        }
        else if("P".equals(s))
        {
            os = os +"82@@45@@7@@@62@4@1@4@61@2@7@4@5@9@9@6@5@@3@5@424@Æ";
        }
        else if("Q".equals(s))
        {
            os = os +"5@6@@52@13@46@12@4@51@4@3@5627@43@58@Æ";
        }
        else if("R".equals(s))
        {
            os = os +"2@9@@2@54@25@54@5@56@54@28@99@45@Æ";
        }
        else if("S".equals(s))
        {
            os = os +"1@41@4@619@758@64@975@864@35@15@48@82@54@77@87@15@11@Æ";
        }
        else if("T".equals(s))
        {
            os = os +"@@2@1@5@24@5@2@2@1215@89@41@61@Æ";
        }
        else if("U".equals(s))
        {
            os = os +"@2@4@5@13@6@52@1@6@3@2@6@15@42@5323@71@182@96@67@45@Æ";
        }
        else if("V".equals(s))
        {
            os = os +"@2@5@6@2@5189@16@72@25@Æ";
        }
        else if("W".equals(s))
        {
            os = os +"@1@2@52@51@25@42@52@4542@95@58@69@44@85@Æ";
        }
        else if("X".equals(s))
        {
            os = os +"@2@14@2@14@@3@65@23622@@11@@44@@Æ";
        }
        else if("Y".equals(s))
        {
            os = os +"@@32@63@25@89@65@74@5819@59@65@Æ";
        }
        else if("Z".equals(s))
        {
            os = os +"@2@@41@25@89@68@53@25@63@25@4722@28@56@64@Æ";
        }
        
        else if("é".equals(s))
        {
           // System.out.print("Done;
            os = os +"7@4@1@8@5@2Æ";
        }
        else if("1".equals(s))
        {
           // System.out.print("Done;
            os = os +"756@2584@6931@4528@3695@14521@2Æ";
        }
        else if("2".equals(s))
        {
         
            os = os +"7965@41452@13578@63258@4585@98752Æ";
        }
        else if("3".equals(s))
        {
         
            os = os +"1247@23694@2561@3248@69855@2452Æ";
        }
        else if("4".equals(s))
        {
         
            os = os +"45237@9684@45631@25898@96585@2Æ";
        }
        else if("5".equals(s))
        {
         
            os = os +"79865@42356@14578@86356@51254@8522Æ";
        }
        else if("6".equals(s))
        {
         
            os = os +"8527@4564@98511@73918@52525@2Æ";
        }
        else if("7".equals(s))
        {
         
            os = os +"9117@114@111@45698@7545@2Æ";
        }
        else if("8".equals(s))
        {
         
            os = os +"6596327@46542@135689@865214@5@2Æ";
        }
        else if("9".equals(s))
        {
         
            os = os +"76363@4254@17854@862149@5@2Æ";
        }
        else if("0".equals(s))
        {
         
            os = os +"7458@445@1247@86359@58524@2Æ";
        }
        else if("@".equals(s))
        {
            os = os +"25@20@104@@9994@6457@3786@Æ";
        }
        else if(".".equals(s))
        {
            os = os +"295@625@9764512@@34615@@965@@@@457@3786@Æ";
        }
        else if("!".equals(s))
        {
            os = os +"11@@96@45@36@8452@1245@36589@Æ";
        }
        else if("#".equals(s))
        {
            os = os +"96@495@@24@@369@@451@@9162@@2@1245@36589@Æ";
        }
        else if("$".equals(s))
        {
            os = os +"9@@6@495@@24@@369@74@@5126@@3425@@4141@@2365@@98@@5@36589@Æ";
        }
        else if("%".equals(s))
        {
            os = os +"9@96@@3546@4@@625@354@@525@41@@2365@@98@@5@36589@Æ";
        }
        else if("^".equals(s))
        {
            os = os +"9@7@@@84@56@2451@@3467@5@89@@5@@61@@34256@@@491@35@614@@6@@@1Æ";
        }
        else if("&".equals(s))
        {
            os = os +"1@2@45@24@35@61@24@578@49@16@45@1@34@5Æ";
        }
        else if("*".equals(s))
        {
            os = os +"95@@625@6254@1212@14@155@Æ";
        }
        else if("(".equals(s))
        {
            os = os +"6@4@315@421@63@457@849@16@43@561@542@78@49@161@345@7@67@45Æ";
        }
        else if(")".equals(s))
        {
            os = os +"6@4@315@421@6911@457@849@16@03@561@542@78@49@161@345@7@67@45Æ";
        }
        else if("-".equals(s))
        {
            os = os +"@521@@@@214@5@2@5@5@6@@@62@@561@542@78@49@161@345@7@67@45Æ";
        }
        else if("_".equals(s))
        {
            os = os +"6@@89@24@156@324@2@@@@412@45@45Æ";
        }
        else if("+".equals(s))
        {
            os = os +"8@625@22@12@42@524@6325@545@84@56@624@62@625@4@532@Æ";
        }
        else if("=".equals(s))
        {
            os = os +"852@455@5@5@5@4@2@1@6@6@5@Æ";
        }
        else if("`".equals(s))
        {
            os = os +"852@455@556@5@5@4@2@1@6@6@5@Æ";
        }
        else if("~".equals(s))
        {
            os = os +"852@455@5@5@5@4@2@6424251@6@6@5@Æ";
        }
        else if("{".equals(s))
        {
            os = os +"8@6@59@45@16@23@56@79@48@15@64@32@5@12Æ";
        }
        else if("[".equals(s))
        {
            os = os +"7@8@457@849@164@5@625@124@526@53@61@6@24@5@Æ";
        }
        else if("}".equals(s))
        {
            os = os +"911@61@6@24@5@Æ";
        }
        else if("]".equals(s))
        {
            os = os +"786@5@124@526@53@61@6@24@5@Æ";
        }
        else if("|".equals(s))
        {
            os = os +"786@5@@@852654@@254@@61@6@24@5@Æ";
        }
        else if("\\".equals(s))
        {
            os = os +"69@355@5@@56@4@25@6@24@5@Æ";
        }
        else if(":".equals(s))
        {
            os = os +"85@2@2@3@65@42@15@63@2@59@86@5@32@6@24@5@Æ";
        }
        else if(";".equals(s))
        {
            os = os +"7@4@58@6@2@5@32@36@52@36@523@24@5@Æ";
        }
        else if("\"".equals(s))
        {
            os = os +"9@65@86@32@54@125636@53@61@6@24@5@Æ";
        }
        else if("<".equals(s))
        {
            os = os +"845236515@@15@1521@@@1@25@Æ";
        }
        else if(">".equals(s))
        {
            os = os +"8@@55@864@215@436@79@48@15@46@352@615@4251@6@24@5@Æ";
        }
        else if("?".equals(s))
        {
            os = os +"7@2@36@5256@5@124@526@53@61@6@24@5@Æ";
        }
        else if(",".equals(s))
        {
            os = os +"786@5@124@@50@12@3@65@2365226@53@61@6@24@5@Æ";
        }
        else if("/".equals(s))
        {
            os = os +"78@6@9@5@3@5@6@98@562@61@6@24@5@Æ";
        }
        else if("'".equals(s))
        {
            os = os +"8@52@56@32@41@25@63@25@41@26@35@245@24@5@Æ";
        }
             
        }
        return(os);
    };







    
}
