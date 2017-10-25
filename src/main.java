import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class main {

	   private static final String FILE_NAME = "C:\\Users\\or9215qv\\Desktop/Test.xlsx";
	   
	   static Random rnd = new Random();
	    public static void main(String[] args) {
	    	
	    	Random rnd = new Random();
	    	int t = Integer.parseInt(JOptionPane.showInputDialog("What do you want (0 for People)(1 for Items)"));
	    	int i = Integer.parseInt(JOptionPane.showInputDialog("How Many do you want?"));
	        XSSFWorkbook workbook = new XSSFWorkbook();
	        XSSFSheet sheet = workbook.createSheet("Datatypes in Java");
	        Map<String, Object[]> data = new TreeMap<String, Object[]>();
	       if(t==0)
	        for (int n=0;  n<i; n++)
	        {
	        	String Fstring=""+n;
	        	System.out.println(Fstring);
	        	data.put(Fstring, new Character().getArray());
	        }
	       if(t==1)
	        for (int n=0;  n<i; n++)
	        {
	        	String Fstring=""+n;
	        	System.out.println(Fstring);
	        	data.put(Fstring, new magicItem().getArray());
	        }
	        System.out.println("Creating excel");

	        Set<String> keyset = data.keySet();
	        int rownum = 0;
	        for (String key : keyset)
	        {
	            Row row = sheet.createRow(rownum++);
	            Object [] objArr = data.get(key);
	            int cellnum = 0;
	            for (Object obj : objArr)
	            {
	               Cell cell = row.createCell(cellnum++);
	               if(obj instanceof String)
	                    cell.setCellValue((String)obj);
	                else if(obj instanceof Integer)
	                    cell.setCellValue((Integer)obj);
	            }
	        }

	        try {
	            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
	            workbook.write(outputStream);
	            workbook.close();
	            System.out.println("Worked");
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Done");
	    }
	   

		private static String HalfelfFFNames() {
			// TODO Auto-generated method stub
			String[] nm3 = {"Alu","Aly","Ar","Bren","Byn","Car","Co","Dar","Del","El","Eli","Fae","Fha","Gal","Gif","Haly","Ho","Ile","Iro","Jen","Jil","Kri","Kys","Les","Lora","Ma","Mar","Mare","Neri","Nor","Ol","Ophi","Phaye","Pri","Qi","Que","Rel","Res","Sael","Saf","Syl","Ther","Tyl","Una","Uri","Ven","Vyl","Win","Wol","Xil","Xyr","Yes","Yll","Zel","Zin"};
			String[] nm4 = {"aerys","anys","bellis","bwynn","cerys","charis","diane","dove","elor","enyphe","faen","fine","galyn","gwynn","hana","hophe","kaen","kilia","lahne","lynn","mae","malis","mythe","nalore","noa","nys","ona","phira","pisys","qarin","qwyn","rila","rora","seris","stine","sys","thana","theris","tihne","trana","viel","vyre","walyn","waris","xaris","xipha","yaries","yra","zenya","zira"};
			int rnd = (int) Math.floor(Math.random() * nm3.length);
			int rnd2 = (int) Math.floor(Math.random() * nm4.length);
			String Names = nm3[rnd] + nm4[rnd2];
			return Names;
		}

		private static String HalforcFFNames() {
			// TODO Auto-generated method stub
			String[] nm4 = {"Al","Ar","Br","Ek","El","Fal","Fel","Fol","Ful","G","Gaj","Gar","Gij","Gor","Gr","Gry","Gyn","Hur","K","Kar","Kat","Ker","Ket","Kir","Kot","Kur","Kut","Lag","M","Mer","Mir","Mor","N","Ol","Oot","Puy","R","Rah","Rahk","Ras","Rash","Raw","Roh","Rohk","S","Sam","San","Sem","Sen","Sh","Shay","Sin","Sum","Sun","Tam","Tem","Tu","Tum","Ub","Um","Ur","Van","Zan","Zen","Zon","Zun"};
			String[] nm5 = {"a","a","o","o","e","i","i","u"};
			String[] nm6 = {"d","da","dar","dur","g","gar","gh","gri","gu","sh","sha","shi","gum","gume","gur","ki","mar","mi","mira","me","mur","ne","ner","nir","nar","nchu","ni","nur","ral","rel","ri","rook","ti","tah","tir","tar","tur","war","z","zar","zara","zi","zur","zura","zira"};
			int rnd = (int) Math.floor(Math.random() * nm4.length);
			int rnd2 = (int) Math.floor(Math.random() * nm5.length);
			int rnd3 = (int) Math.floor(Math.random() * nm6.length);
			String Names = nm4[rnd] + nm5[rnd2] + nm6[rnd3];
			return Names;
		}

		private static String GnomeFFNames() {
			// TODO Auto-generated method stub
			String[] nm3 = {"Alu","Ari","Ban","Bree","Car","Cel","Daphi","Do","Eili","El","Fae","Fen","Fol","Gal","Gren","Hel","Hes","Ina","Iso","Jel","Jo","Klo","Kri","Lil","Lori","Min","My","Ni","Ny","Oda","Or","Phi","Pri","Qi","Que","Re","Rosi","Sa","Sel","Spi","Ta","Tifa","Tri","Ufe","Uri","Ven","Vo","Wel","Wro","Xa","Xyro","Ylo","Yo","Zani","Zin"};
			String[] nm4 = {"bi","bys","celi","ci","dira","dysa","fi","fyx","gani","gyra","hana","hani","kasys","kini","la","li","lin","lys","mila","miphi","myn","myra","na","niana","noa","nove","phina","pine","qaryn","qys","rhana","roe","sany","ssa","sys","tina","tra","wyn","wyse","xi","xis","yaris","yore","za","zyre"};
			int rnd = (int) Math.floor(Math.random() * nm3.length);
			int rnd2 = (int) Math.floor(Math.random() * nm4.length);
			String Names = nm3[rnd] + nm4[rnd2];
			return Names;
		}

		private static String TieflingFFNames() {
			// TODO Auto-generated method stub
			String[] nm4 = {"Af","Agne","Ani","Ara","Ari","Aria","Bel","Bri","Cre","Da","Di","Dim","Dor","Ea","Fri","Gri","His","In","Ini","Kal","Le","Lev","Lil","Ma","Mar","Mis","Mith","Na","Nat","Ne","Neth","Nith","Ori","Pes","Phe","Qu","Ri","Ro","Sa","Sar","Seiri","Sha","Val","Vel","Ya","Yora","Yu","Za","Zai","Ze"};
			String[] nm5 = {"bis","borys","cria","cyra","dani","doris","faris","firith","goria","grea","hala","hiri","karia","ki","laia","lia","lies","lista","lith","loth","lypsis","lyvia","maia","meia","mine","narei","nirith","nise","phi","pione","punith","qine","rali","rissa","seis","solis","spira","tari","tish","uphis","vari","vine","wala","wure","xibis","xori","yis","yola","za","zes"};
			int rnd = (int) Math.floor(Math.random() * nm4.length);
			int rnd2 = (int) Math.floor(Math.random() * nm5.length);
			String Names = nm4[rnd] + nm5[rnd2];
			return Names;
		}

		private static String DragonbornFFNames() {
			// TODO Auto-generated method stub
			String[] nm3 = {"Ari","A","Bi","Bel","Cris","Ca","Drys","Da","Erli","Esh","Fae","Fen","Gur","Gri","Hin","Ha","Irly","Irie","Jes","Jo","Ka","Kel","Ko","Lilo","Lora","Mal","Mi","Na","Nes","Nys","Ori","O","Ophi","Phi","Per","Qi","Quil","Rai","Rashi","So","Su","Tha","Ther","Uri","Ushi","Val","Vyra","Welsi","Wra","Xy","Xis","Ya","Yr","Zen","Zof"};
			String[] nm4 = {"birith","bis","bith","coria","cys","dalynn","drish","drith","faeth","fyire","gil","gissa","gwen","hime","hymm","karyn","kira","larys","liann","lyassa","meila","myse","norae","nys","patys","pora","qorel","qwen","rann","riel","rina","rinn","rish","rith","saadi","shann","sira","thibra","thyra","vayla","vyre","vys","wophyl","wyn","xiris","xora","yassa","yries","zita","zys"};
			int rnd = (int) Math.floor(Math.random() * nm3.length);
			int rnd2 = (int) Math.floor(Math.random() * nm4.length);
			String Names = nm3[rnd] + nm4[rnd2];
			return Names;
		}

		private static String HalflingFFNames() {
			// TODO Auto-generated method stub
			String[] nm3 = {"An","Ari","Bel","Bre","Cal","Chen","Dar","Dia","Ei","Eo","Eli","Era","Fay","Fen","Fro","Gel","Gra","Ha","Hil","Ida","Isa","Jay","Jil","Kel","Kith","Le","Lid","Mae","Mal","Mar","Ne","Ned","Odi","Ora","Pae","Pru","Qi","Qu","Ri","Ros","Sa","Shae","Syl","Tham","Ther","Tryn","Una","Uvi","Va","Ver","Wel","Wi","Xan","Xi","Yes","Yo","Zef","Zen"};
			String[] nm4 = {"alyn","ara","brix","byn","caryn","cey","da","dove","drey","elle","eni","fice","fira","grace","gwen","haly","jen","kath","kis","leigh","la","lie","lile","lienne","lyse","mia","mita","ne","na","ni","nys","ola","ora","phina","prys","rana","ree","ri","ris","sica","sira","sys","tina","trix","ula","vira","vyre","wyn","wyse","yola","yra","zana","zira"};
			int rnd = (int) Math.floor(Math.random() * nm3.length);
			int rnd2 = (int) Math.floor(Math.random() * nm4.length);
			String Names = nm3[rnd] + nm4[rnd2];
			return Names;
		}

		private static String ElfFFNames() {
			// TODO Auto-generated method stub
			String[] nm3 = {"Ad","Ara","Bi","Bry","Cai","Chae","Da","Dae","Eil","En","Fa","Fae","Gil","Gre","Hele","Hola","Iar","Ina","Jo","Key","Kris","Lia","Lora","Mag","Mia","Neri","Ola","Ori","Phi","Pres","Qi","Qui","Rava","Rey","Sha","Syl","Tor","Tris","Ula","Uri","Val","Ven","Wyn","Wysa","Xil","Xyr","Yes","Ylla","Zin","Zyl"};
			String[] nm4 = {"banise","bella","caryn","cyne","di","dove","fiel","fina","gella","gwyn","hana","harice","jyre","kalyn","krana","lana","lee","leth","lynn","moira","mys","na","nala","phine","phyra","qirelle","ra","ralei","rel","rie","rieth","rona","rora","roris","satra","stina","sys","thana","thyra","tris","varis","vyre","wenys","wynn","xina","xisys","ynore","yra","zana","zorwyn"};
			int rnd = (int) Math.floor(Math.random() * nm3.length);
			int rnd2 = (int) Math.floor(Math.random() * nm4.length);
			String Names = nm3[rnd] + nm4[rnd2];
			return Names;
		}

		private static String DwarfFFNames() {
			// TODO Auto-generated method stub
			String[] nm1 = {"Ad","Am","Arm","Baer","Daer","Bal","Ban","Bar","Bel","Ben","Ber","Bhal","Bhar","Bhel","Bram","Bran","Brom","Brum","Bun","Dal","Dar","Dol","Dul","Eb","Em","Erm","Far","Gal","Gar","Ger","Gim","Gral","Gram","Gran","Grem","Gren","Gril","Gry","Gul","Har","Hjal","Hjol","Hjul","Hor","Hul","Hur","Kar","Khar","Kram","Krom","Krum","Mag","Mal","Mel","Mor","Muir","Mur","Rag","Ran","Reg","Rot","Thal","Thar","Thel","Ther","Tho","Thor","Thul","Thur","Thy","Tor","Ty","Um","Urm","Von"};
			String[] nm2 = {"adin","bek","brek","dahr","dain","dal","dan","dar","dek","dir","dohr","dor","drak","dram","dren","drom","drum","drus","duhr","dur","dus","garn","gram","gran","grim","grom","gron","grum","grun","gurn","gus","iggs","kahm","kam","kohm","kom","kuhm","kum","kyl","man","mand","mar","mek","miir","min","mir","mond","mor","mun","mund","mur","mus","myl","myr","nam","nar","nik","nir","nom","num","nur","nus","nyl","rak","ram","ren","rig","rigg","rik","rim","rom","ron","rum","rus","ryl","tharm","tharn","thran","thrum","thrun"};
			int rnd = (int) Math.floor(Math.random() * nm1.length);
			int rnd2 = (int) Math.floor(Math.random() * nm2.length);
			String Names = nm1[rnd] + nm2[rnd2];
			return Names;
		}

		private static String HalfelfMFNames() {
			// TODO Auto-generated method stub
			String[] nm1 = {"Al","Aro","Bar","Bel","Cor","Cra","Dav","Dor","Eir","El","Fal","Fril","Gaer","Gra","Hal","Hor","Ian","Ilo","Jam","Kev","Kri","Leo","Lor","Mar","Mei","Nil","Nor","Ori","Os","Pan","Pet","Quo","Raf","Ri","Sar","Syl","Tra","Tyr","Uan","Ul","Van","Vic","Wal","Wil","Xan","Xav","Yen","Yor","Zan","Zyl"};
			String[] nm2 = {"avor","ben","borin","coril","craes","deyr","dithas","elor","enas","faelor","faerd","finas","fyr","gotin","gretor","homin","horn","kas","koris","lamir","lanann","lumin","minar","morn","nan","neak","neiros","orin","ovar","parin","phanis","qarim","qinor","reak","ril","ros","sariph","staer","torin","tumil","valor","voril","warith","word","xian","xiron","yeras","ynor","zaphir","zaren"};
			int rnd = (int) Math.floor(Math.random() * nm1.length);
			int rnd2 = (int) Math.floor(Math.random() * nm2.length);
			String Names = nm1[rnd] + nm2[rnd2];
			return Names;
		}

		private static String HalforcMFNames() {
			// TODO Auto-generated method stub
			String[] nm1 = {"Ag","Agg","Ar","Arn","As","At","Atr","B","Bar","Bel","Bor","Br","Brak","C","Cr","D","Dor","Dr","Dur","G","Gal","Gan","Gar","Gna","Gor","Got","Gr","Gram","Grim","Grom","Grum","Gul","H","Hag","Han","Har","Hog","Hon","Hor","Hun","Hur","K","Kal","Kam","Kar","Kel","Kil","Kom","Kor","Kra","Kru","Kul","Kur","Lum","M","Mag","Mahl","Mak","Mal","Mar","Mog","Mok","Mor","Mug","Muk","Mura","N","Oggu","Ogu","Ok","Oll","Or","Rek","Ren","Ron","Rona","S","Sar","Sor","T","Tan","Th","Thar","Ther","Thr","Thur","Trak","Truk","Ug","Uk","Ukr","Ull","Ur","Urth","Urtr","Z","Za","Zar","Zas","Zav","Zev","Zor","Zur","Zus"};
			String[] nm2 = {"a","a","a","o","o","e","i","u","u","u"};
			String[] nm3 = {"bak","bar","bark","bash","bur","burk","d","dak","dall","dar","dark","dash","dim","dur","durk","g","gak","gall","gar","gark","gash","glar","gul","gur","m","mak","mar","marsh","mash","mir","mur","n","nar","nars","nur","rak","rall","rash","rim","rimm","rk","rsh","rth","ruk","sk","tar","tir","tur","z","zall","zar","zur"};
			int rnd = (int) Math.floor(Math.random() * nm1.length);
			int rnd2 = (int) Math.floor(Math.random() * nm2.length);
			int rnd3 = (int) Math.floor(Math.random() * nm3.length);
			String Names = nm1[rnd] + nm2[rnd2] + nm3[rnd3];
			return Names;
		}

		private static String GnomeMFNames() {
			// TODO Auto-generated method stub
			String[] nm1 = {"Al","Ari","Bil","Bri","Cal","Cor","Dav","Dor","Eni","Er","Far","Fel","Ga","Gra","His","Hor","Ian","Ipa","Je","Jor","Kas","Kel","Lan","Lo","Man","Mer","Nes","Ni","Or","Oru","Pana","Po","Qua","Quo","Ras","Ron","Sa","Sal","Sin","Tan","To","Tra","Um","Uri","Val","Vor","War","Wil","Wre","Xal","Xo","Ye","Yos","Zan","Zil"};
			String[] nm2 = {"bar","ben","bis","corin","cryn","don","dri","fan","fiz","gim","grim","hik","him","ji","jin","kas","kur","len","lin","min","mop","morn","nan","ner","ni","pip","pos","rick","ros","rug","ryn","ser","ston","tix","tor","ver","vyn","win","wor","xif","xim","ybar","yur","ziver","zu"};
			int rnd = (int) Math.floor(Math.random() * nm1.length);
			int rnd2 = (int) Math.floor(Math.random() * nm2.length);
			String Names = nm1[rnd] + nm1[rnd2];
			return Names;
		}

		private static String TieflingMFNames() {
			// TODO Auto-generated method stub
			String[] nm1 = {"Aet","Ak","Am","Aran","And","Ar","Ark","Bar","Car","Cas","Dam","Dhar","Eb","Ek","Er","Gar","Gu","Gue","Hor","Ia","Ka","Kai","Kar","Kil","Kos","Ky","Loke","Mal","Male","Mav","Me","Mor","Neph","Oz","Ral","Re","Rol","Sal","Sha","Sir","Ska","The","Thy","Thyne","Ur","Uri","Val","Xar","Zar","Zer","Zher","Zor"};
			String[] nm2 = {"adius","akas","akos","char","cis","cius","dos","emon","ichar","il","ilius","ira","lech","lius","lyre","marir","menos","meros","mir","mong","mos","mus","non","rai","rakas","rakir","reus","rias","ris","rius","ron","ros","rus","rut","shoon","thor","thos","thus","us","venom","vir","vius","xes","xik","xikas","xire","xius","xus","zer","zire"};
			int rnd = (int) Math.floor(Math.random() * nm1.length);
			int rnd2 = (int) Math.floor(Math.random() * nm2.length);
			String Names = nm1[rnd] + nm1[rnd2];
			return Names;
		}

		private static String DragonbornMFNames() {
			// TODO Auto-generated method stub
			String[] nm1 = {"Ali","Ar","Ba","Bal","Bel","Bha","Bren","Caer","Calu","Dur","Do","Dra","Era","Faer","Fro","Gre","Ghe","Gora","He","Hi","Ior","Jin","Jar","Kil","Kriv","Lor","Lumi","Mar","Mor","Med","Nar","Nes","Na","Oti","Orla","Pri","Pa","Qel","Ravo","Ras","Rho","Sa","Sha","Sul","Taz","To","Trou","Udo","Uro","Vor","Vyu","Vrak","Wor","Wu","Wra","Wul","Xar","Yor","Zor","Zra"};
			String[] nm2 = {"barum","bor","broth","ciar","crath","daar","dhall","dorim","farn","fras","gar","ghull","grax","hadur","hazar","jhan","jurn","kax","kris","kul","lasar","lin","mash","morn","naar","prax","qiroth","qrin","qull","rakas","rash","rinn","roth","sashi","seth","skan","trin","turim","varax","vroth","vull","warum","wunax","xan","xiros","yax","ythas","zavur","zire","ziros"};
			int rnd = (int) Math.floor(Math.random() * nm1.length);
			int rnd2 = (int) Math.floor(Math.random() * nm2.length);
			String Names = nm1[rnd] + nm2[rnd2];
			return Names;
		}

		private static String HalflingMFNames() {
			// TODO Auto-generated method stub
			String[] nm1 = {"An","Ar","Bar","Bel","Con","Cor","Dan","Dav","El","Er","Fal","Fin","Flyn","Gar","Go","Hal","Hor","Ido","Ira","Jan","Jo","Kas","Kor","La","Lin","Mar","Mer","Ne","Nor","Ori","Os","Pan","Per","Pim","Quin","Quo","Ri","Ric","San","Shar","Tar","Te","Ul","Uri","Val","Vin","Wen","Wil","Xan","Xo","Yar","Yen","Zal","Zen"};
			String[] nm2 = {"ace","amin","bin","bul","dak","dal","der","don","emin","eon","fer","fire","gin","hace","horn","kas","kin","lan","los","min","mo","nad","nan","ner","orin","os","pher","pos","ras","ret","ric","rich","rin","ry","ser","sire","ster","ton","tran","umo","ver","vias","von","wan","wrick","yas","yver","zin","zor","zu"};
			int rnd = (int) Math.floor(Math.random() * nm1.length);
			int rnd2 = (int) Math.floor(Math.random() * nm2.length);
			String Names = nm1[rnd] + nm2[rnd2];
			return Names;
		}

		private static String ElfMFNames() {
			// TODO Auto-generated method stub
			String[] nm1 = {"Ad","Ae","Bal","Bei","Car","Cra","Dae","Dor","El","Ela","Er","Far","Fen","Gen","Glyn","Hei","Her","Ian","Ili","Kea","Kel","Leo","Lu","Mira","Mor","Nae","Nor","Olo","Oma","Pa","Per","Pet","Qi","Qin","Ralo","Ro","Sar","Syl","The","Tra","Ume","Uri","Va","Vir","Waes","Wran","Yel","Yin","Zin","Zum"};
			String[] nm2 = {"balar","beros","can","ceran","dan","dithas","faren","fir","geiros","golor","hice","horn","jeon","jor","kas","kian","lamin","lar","len","maer","maris","menor","myar","nan","neiros","nelis","norin","peiros","petor","qen","quinal","ran","ren","ric","ris","ro","salor","sandoral","toris","tumal","valur","ven","warin","wraek","xalim","xidor","yarus","ydark","zeiros","zumin"};
			int rnd = (int) Math.floor(Math.random() * nm1.length);
			int rnd2 = (int) Math.floor(Math.random() * nm2.length);
			String Names = nm1[rnd] + nm2[rnd2];
			return Names;
		}

		private static String DwarfMFNames() {
			// TODO Auto-generated method stub
			String[] nm3 = {"An","Ar","Baer","Bar","Bel","Belle","Bon","Bonn","Braen","Bral","Bralle","Bran","Bren","Bret","Bril","Brille","Brol","Bron","Brul","Bryl","Brylle","Bryn","Bryt","Byl","Bylle","Daer","Dear","Dim","Ed","Ein","El","Gem","Ger","Gwan","Gwen","Gwin","Gwyn","Gym","Ing","Jen","Jenn","Jin","Jyn","Kait","Kar","Kat","Kath","Ket","Las","Lass","Les","Less","Lyes","Lys","Lyss","Maer","Maev","Mar","Mis","Mist","Myr","Mys","Myst","Naer","Nal","Nas","Nass","Nes","Nis","Nys","Raen","Ran","Red","Reyn","Run","Ryn","Sar","Sol","Tas","Taz","Tis","Tish","Tiz","Tor","Tys","Tysh"};
			String[] nm4 = {"belle","bera","delle","deth","dielle","dille","dish","dora","dryn","dyl","giel","glia","glian","gwyn","la","leen","leil","len","lin","linn","lyl","lyn","lynn","ma","mera","mora","mura","myl","myla","nan","nar","nas","nera","nia","nip","nis","niss","nora","nura","nyl","nys","nyss","ra","ras","res","ri","ria","rielle","rin","ris","ros","ryl","ryn","sael","selle","sora","syl","thel","thiel","tin","tyn","va","van","via","vian","waen","win","wyn","wynn"};
			int rnd = (int) Math.floor(Math.random() * nm3.length);
			int rnd2 = (int) Math.floor(Math.random() * nm4.length);
			String Names = nm3[rnd] + nm4[rnd2];
			return Names;
		}

		private static String HumanFFNames() {
			// TODO Auto-generated method stub
		String[] namesFemale = {"Aaliyah","Abagail","Abbey","Abbie","Abbigail","Abby","Abelia","Abelina","Abella","Abigail","Abigale","Abigayle","Abril","Aceline","Adalene","Adalicia","Adalie","Adaliz","Adalyn","Addie","Addison","Adela","Adelaide","Adele","Adelia","Adelina","Adeline","Adelisa","Adelise","Adelle","Adelynn","Adilene","Adorlee","Adreanna","Adriana","Adriane","Adrianna","Adrianne","Adriene","Adrienne","Adula","Aeldrida","Aelfreda","Afra","Afrodille","Afton","Agatha","Agathe","Agda","Aget","Aggy","Aglaia","Aglaja","Agnes","Agnese","Agnita","Agrona","Aida","Aiglentina","Aileen","Aillsa","Ailsa","Ailssa","Aimee","Ainsley","Aischa","Aisha","Aislinn","Aiyana","Aja","Akira","Alaina","Alaine","Alair","Alana","Alanis","Alanna","Alarica","Alarice","Alarise","Alayna","Alban","Alberta","Albertina","Albertyna","Albertyne","Alcott","Alda","Alden","Aldercy","Alea","Aleah","Alejandra","Alena","Alessandra","Aletta","Alex","Alexa","Alexandra","Alexandrea","Alexandria","Alexandrina","Alexandrine","Alexia","Alexiana","Alexis","Alexus","Alexys","Alfonsine","Alhertine","Alia","Alice","Alicia","Alida","Alina","Alisa","Alisanne","Alisha","Alisia","Alison","Alissa","Alita","Alivia","Alix","Alixandra","Aliya","Aliyah","Aliza","Alize","Allaire","Alleffra","Allegra","Allesha","Allete","Allie","Allison","Ally","Allyson","Allyssa","Alma","Almuth","Alondra","Alonza","Aloys","Aloyse","Alphonsina","Alphonsine","Alsatia","Althea","Althee","Alva","Alvina","Alvine","Alwara","Alwera","Alwine","Alycia","Alysa","Alysha","Alyson","Alyssa","Alyssandra","Amabel","Amabella","Amabelle","Amabilia","Amadea","Amalberga","Amalia","Amalie","Amanda","Amani","Amara","Amarante","Amari","Amata","Amaya","Amber","Amberjill","Ambra","Ambre","Amedea","Amedee","Amelia","Amelie","Amely","America","Ami","Amia","Amie","Amina","Amira","Amite","Amitee","Amity","Amrei","Amy","Amya","Ana","Anabel","Anahi","Anais","Anastasia","Anastasija","Anastina","Anaya","Ancelin","Ancelina","Andie","Andra","Andrea","Andree","Aneta","Anette","Ange","Angel","Angela","Angeletta","Angelette","Angelia","Angelica","Angelika","Angelina","Angeline","Angelique","Angie","Angilia","Anika","Anina","Anissa","Anita","Aniya","Aniyah","Anja","Anjali","Anjuschka","Anka","Anke","Ann","Anna","Annabel","Annabella","Annabelle","Annalena","Annalise","Annamaria","Anne","Anne-Kathrin","Annekathrin","Anneke","Annelie","Anneliese","Annemarie","Annett","Annette","Annia","Annie","Annika","Annike","Annique","Anouk","Ansley","Antje","Antoinette","Antonella","Antonette","Antonia","Antonie","Antonina","Anuschka","Anya","Apollina","Apolline","Appollonia","April","Arabela","Arabella","Araceli","Aracely","Arantxa","Arcene","Arely","Aria","Ariadne","Ariana","Ariane","Arianna","Arianne","Ariel","Ariele","Ariella","Arielle","Arjean","Arleigh","Arlene","Arleta","Arlett","Arlette","Armani","Armelle","Armina","Armine","Arminia","Arnalda","Arnelle","Arsène","Aruna","Aryanna","Ash","Ashanti","Ashby","Ashe","Ashford","Ashi","Ashlan","Ashlee","Ashleigh","Ashley","Ashli","Ashlie","Ashlin","Ashling","Ashly","Ashlyn","Ashlynn","Ashton","Ashtyn","Asia","Aspen","Asta","Asteria","Astred","Astrid","Athena","Auberta","Aubina","Aubine","Aubree","Aubrey","Aubriana","Aubrianne","Aubrie","Aubry","Audery","Audey","Audie","Audra","Audrey","Audry","Aurelia","Aurelie","Aurica","Aurora","Aurorette","Autumn","Ava","Aveline","Avery","Avicia","Avon","Avril","Axelle","Ayana","Ayanna","Ayasha","Ayla","Aylin","Aysche","Aysun","Azzura","Babette","Baby","Baerbel","Bailee","Bailey","Barbara","Bathilda","Bathilde","Batilda","Batilde","Baxter","Baylee","Bea","Beata","Beate","Beatrice","Beatrix","Beatriz","Bebe","Becky","Belana","Belda","Belen","Belinda","Beline","Bell","Bella","Belle","Benedetta","Benedicta","Benedikta","Benita","Bente","Berangaria","Berdine","Berengaria","Berenice","Berenike","Berit","Bernadea","Bernadette","Bernadina","Bernadine","Bernarda","Bernarde","Berneen","Bernelle","Bernetta","Bernette","Bernhardine","Bernice","Berniss","Bernita","Bernyce","Bert","Berta","Berte","Bertha","Berthe","Bertie","Bertille","Bertina","Berty","Bessy","Bethany","Bette","Betti","Bettina","Bettine","Bev","Beverely","Beverley","Beverly","Bianca","Bianka","Bibi","Bibijana","Bijou","Bille","Billie","Billy","Bina","Bine","Binga","Binia","Birger","Birgit","Birgitta","Birke","Birte","Blaine","Blanca","Blanch","Blanche","Blanchefleur","Blandina","Blanka","Blenda","Blondell","Blondelle","Blondene","Blossom","Blythe","Bo","Bobbi","Bobbie","Bobby","Bojana","Bojena","Bonnie","Bonny","Borissa","Brandi","Brandy","Brea","Breana","Breanna","Brenda","Brenna","Breonna","Bret","Brett","Bretta","Brettany","Brette","Bria","Briana","Brianna","Brianne","Bridget","Bridgett","Bridgette","Brielle","Brigette","Brigitta","Brigitte","Brionna","Brisa","Brita","Britney","Britt","Britta","Brittany","Brittney","Bronja","Bronwen","Bronwyn","Brook","Brooke","Brookes","Brooklyn","Brooklynn","Brooks","Brucie","Brunella","Brunhild","Brunhilda","Brunhilde","Bryana","Bryanna","Brynn","Buffy","Burgi","Cäzilie","Cadence","Cadencia","Cady","Caitlin","Caitlyn","Caja","Calandre","Calantha","Calanthe","Cali","Calista","Callie","Cam","Cameron","Camila","Camile","Camilla","Camille","Camillei","Camm","Cammi","Cammie","Camryn","Camyron","Candace","Candice","Candide","Capucina","Capucine","Cara","Caress","Caressa","Caresse","Carin","Carina","Carine","Carissa","Carla","Carlee","Carley","Carli","Carlie","Carling","Carlotta","Carly","Carmela","Carmelia","Carmen","Carnation","Caro","Carol","Carola","Carole","Carolin","Carolina","Caroline","Carolyn","Carressa","Carrie","Carry","Carson","Carsta","Casandra","Casey","Cassandra","Cassidy","Cassie","Catalina","Cateline","Catharina","Catherine","Cathleen","Cathrin","Cayla","Cecelia","Cecile","Cecilia","Cecilie","Cecille","Cedrine","Celesse","Celeste","Celestia","Celestiel","Celestine","Celestyn","Celestyna","Celia","Celie","Celina","Celine","Cellina","Cendrillon","Cerise","Chana","Chanel","Chanell","Chanelle","Channelle","Chantae","Chantal","Chantalle","Chantay","Chante","Chantel","Chantell","Chantelle","Chantrell","Chardae","Charee","Charis","Charisse","Charity","Charlaine","Charlayne","Charleen","Charleena","Charlena","Charlene","Charlette","Charline","Charlisa","Charlita","Charlize","Charlot","Charlotta","Charlotte","Charmain","Charmaine","Charmayne","Charmine","Chasity","Chaunte","Chauntel","Chaya","Chelsea","Chelsey","Chelsie","Chenelle","Cher","Chere","Cheree","Chereen","Cherell","Cherelle","Cheri","Cherie","Cherina","Cherine","Cherise","Cherita","Cherree","Cherrelle","Cherry","Cheryl","Cheyanna","Cheyanne","Cheyenne","Chiana","Chianna","Chiara","Chlarimonda","Chlarimonde","Chloe","Chlorinde","Chloris","Chlothilde","Christa","Christel","Christian","Christiana","Christiane","Christin","Christina","Christine","Christy","Ciara","Cicilina","Ciera","Cierra","Cilia","Cinderella","Cindy","Cinzia","Cira","Citlali","Claiborne","Clair","Claire","Clara","Claral","Clare","Clarette","Claribel","Clarice","Clarimond","Clarimonda","Clarimonde","Clarinda","Clarissa","Clarissa Claudia","Clarisse","Clarita","Claudette","Claudia","Claudine","Clemance","Clemence","Clementia","Clementina","Clementine","Clodia","Clothilda","Clothilde","Clotilda","Clotilde","Clovis","Coco","Coleta","Coletta","Colette","Colleen","Colletta","Collette","Columbia","Comfort","Comforte","Conni","Connie","Conny","Conrada","Conradina","Conradine","Constance","Constancia","Constanze","Cora","Coralie","Cordelia","Cordula","Corette","Corina","Corine","Corinna","Corinne","Corliss","Cornelia","Corney","Cortney","Cosette","Cosima","Cosma","Courtlyn","Courtney","Creissant","Crescent","Cristal","Cristina","Crystal","Cybille","Cynthia","Cyprienne","Daggy","Dagmar","Dagmara","Dagny","Daisey","Daisi","Daisy","Dajana","Dakota","Dale","Dalia","Damaris","Damia","Damiana","Damiane","Damie","Damien","Dana","Danae","Dania","Daniela","Daniella","Danielle","Danja","Danna","Danny","Dany","Daphne","Daralis","Darby","Darcel","Darcell","Darcelle","Darcey","Darchelle","Darci","Darcia","Darcy","Daria","Darlene","Dasia","Daveney","Dawina","Dawn","Dayana","Dea","Deanna","Deasia","Debby","Debora","Deborah","Debra","Deik","Deja","Dela","Delaney","Dele","Delfine","Delia","Delight","Delilah","Delit","Della","Delmare","Delphina","Delphine","Demelza","Demie","Denice","Deniece","Denise","Denisha","Denissa","Denisse","Dennise","Denyse","Dereka","Derica","Dericka","Derrica","Desarae","Desaree","Desideria","Desirae","Desirat","Desire","Desiree","Destanee","Destine","Destinee","Destiney","Destini","Destinie","Destiny","Devan","Devana","Devanna","Devin","Devon","Devona","Devondra","Devonna","Devonne","Devyn","Devynn","Dezirae","Deziree","Di","Diahann","Diahna","Diamanta","Diamond","Dian","Diana","Diandra","Diane","Dianna","Diannah","Dianne","Dick","Dickie","Didina","Dina","Dionne","Dior","Dixie","Dodo","Dolores","Domenica","Dominica","Dominika","Dominique","Donna","Dora","Dorchen","Dore","Doreen","Dorene","Dorette","Dorika","Dorine","Doris","Dorkas","Doro","Dorothea","Dorothee","Dorothy","Dortas","Dortje","Dory","Dragana","Druella","Druilla","Dulce","Dunja","Dyana","Dyann","Dyanna","Dylan","Eada","Eartha","Easter","Ebony","Eda","Edda","Edeline","Eden","Edith","Editha","Edithe","Edlyn","Edmee","Edolie","Edsel","Effi","Eglantina","Eglantine","Eike","Eila","Eileen","Ela","Elaina","Elaine","Elayna","Elber","Elberta","Elda","Eldrida","Eleanor","Elektra","Elena","Eleonora","Eleonore","Eleta","Elfi","Elfie","Elfreda","Elfrida","Elfrieda","Elfriede","Elga","Eliana","Eliane","Elicia","Elienor","Elin","Elina","Elinore","Elisa","Elisabet","Elisabeth","Elisabetta","Elisamarie","Elise","Elisha","Elishia","Elissa","Elita","Eliza","Elizabeth","Elka","Elke","Ella","Ellaine","Ellayne","Elle","Ellen","Elli","Ellie","Ellinor","Elmina","Eloisa","Eloise","Eloisee","Elrica","Elsa","Elsbeth","Else","Elvira","Elvire","Elyse","Elyssa","Ema","Emanuela","Emanuele","Ember","Emele","Emelina","Emeline","Emelka","Emely","Emelyne","Emerald","Emeraude","Emerson","Emilee","Emilia","Emilie","Emily","Emma","Emmalee","Emmaline","Emmalyn","Emmeline","Emmi","Emmy","Ena","Encarna","Engelberga","Engelbert","Engelberta","Engelbertha","Engelberthe","Enna","Enrica","Eri","Erica","Ericka","Erika","Erin","Erma","Erme","Ermina","Erminia","Erminie","Erna","Ernesta","Ernstina","Esdras","Esme","Esmeralda","Esmeraude","Esperanza","Esra","Essence","Estee","Estefani","Estefania","Estefany","Estella","Estelle","Ester","Esther","Estrella","Estrid","Etelka","Ethel","Ethelda","Ethelinda","Etheline","Ethyl","Ethylyn","Etta","Eudokia","Eudoxia","Eufemia","Eugenia","Eugenie","Eulalie","Euphemia","Euphrasia","Eusebia","Ev","Eva","Eva-maria","Evangelina","Evangeline","Evchen","Eve","Evelia","Evelien","Evelin","Evelina","Eveline","Evelyn","Evelyne","Evette","Evi","Evita","Evon","Evonna","Evonne","Evony","Ewelina","Ezra","Fabia","Fabiana","Fabienne","Fabiola","Fae","Faith","Faithe","Fanchon","Fanchone","Fanetta","Fanette","Fantina","Fantine","Fara","Faralda","Farrah","Fastrada","Fatima","Fatime","Fatma","Faun","Fauna","Faunia","Fausta","Faustina","Faustine","Favor","Fawnia","Fay","Fayanna","Faye","Fayette","Fayme","Fealty","Fearn","Fearne","Federica","Federiga","Fedora","Felda","Felecia","Feli","Felicia","Felicienne","Felicitas","Felicity","Felina","Felizitas","Ferdinanda","Fern","Fernanda","Fernandina","Ferne","Fernly","Fidelia","Fifi","Fifine","Filicia","Finetta","Finja","Finnja","Fiona","Fjodora","Fleta","Fleur","Fleurette","Flora","Florence","Florentia","Florenzia","Floressa","Floretta","Florette","Flori","Floria","Floriana","Florida","Florina","Florinda","Florrie","Fontanne","Fortuna","Fortunat","Franca","France","Francena","Francene","Frances","Francesca","Francille","Francina","Francine","Francoise","Franja","Franka","Fransiska","Franzi","Franziska","Frauke","Frauwa","Frawa","Freda","Freddie","Freida","Frida","Frieda","Friederika","Friederike","Fritzi","Fritzie","Gabi","Gabriela","Gabriele","Gabriella","Gabrielle","Gaby","Gaetana","Gaetane","Gail","Gala","Galatea","Galatee","Galateia","Gale","Galiana","Galiena","Galilea","Galina","Galla","Gallia","Ganja","Garland","Garnet","Garnett","Gatty","Gay","Gayle","Gemma","Genesis","Geneva","Geneve","Genevie","Genevieve","Genevre","Genia","Genie","Genivee","Genovefa","Genoveva","Georgette","Georgia","Georgine","Georgitte","Geraldene","Geraldine","Geralyn","Geralynn","Gerda","Gerde","Gerdi","Gerdie","Geri","Gerlind","Gerlinde","Gerlindis","Germain","Germaine","Germana","Gerti","Gertraud","Gertraude","Gertraut","Gertrud","Gertrude","Gertrudis","Gesa","Gescha","Gia","Giana","Gianna","Gigi","Gilla","Gillian","Gina","Ginette","Gioa","Giovanna","Gisela","Gisele","Gisella","Giselle","Gisselle","Gitta","Gitte","Giuletta","Giulia","Giuliana","Giulietta","Giuseppa","Giustina","Gleda","Gloria","Gloriana","Gloriosa","Godiva","Golda","Goldie","Grace","Gracie","Graciela","Gracy","Grania","Gratia","Grazia","Graziella","Greta","Gretchen","Grete","Gretel","Grethe","Gretti","Grit","Gritt","Grizelda","Guadalupe","Gudrun","Gudrune","Gudula","Guilla","Gulja","Gunda","Gunde","Gundel","Gundela","Gundula","Gustava","Gustave","Gwend","Gwenda","Gwendolin","Gwendolina","Gwendoline","Gwendolyn","Gypsy","Gytha","Hadley","Hailee","Hailey","Hailie","Haleigh","Halette","Haley","Halfreida","Halfrida","Halfrieda","Halie","Halle","Hallie","Halsey","Hana","Hanna","Hannah","Hannchen","Hanne","Hannele","Hannelore","Hanni","Hanrietta","Hanriette","Harley","Harmony","Harriet","Harriett","Harrietta","Harriette","Harva","Harvelle","Harvina","Harvine","Hattie","Hatty","Hauke","Haven","Hayden","Haylee","Hayleigh","Hayley","Haylie","Hazel","Heather","Heaven","Hedda","Heddi","Heddy","Hedi","Hedvige","Hedwig","Hedy","Heide","Heidi","Heidrun","Heidy","Heike","Heinrike","Helaine","Helen","Helena","Helene","Helga","Helma","Helmi","Heloise","Hemma","Hendrikje","Henni","Henrietta","Henriette","Henrika","Henrike","Hera","Herma","Hermia","Hermine","Hermione","Hertha","Hester","Hetdt","Hettie","Hidie","Hilaire","Hild","Hilda","Hilde","Hildegard","Hildegarde","Hildemar","Hildie","Hildreth","Hildretha","Hilke","Hilma","Hollace","Hollee","Holli","Hollie","Holly","Hollye","Honey","Honore","Hope","Huberta","Hubertha","Huberthe","Hubertina","Hubertine","Huette","Hugette","Huguetta","Hulda","Hunter","Ida","Idda","Idelia","Idina","Idona","Ignatia","Iken","Ila","Ilga","Iliana","Iljana","Ilka","Ilona","Ilonka","Ilse","Imani","Imke","Immaculata","Immakulata","Ina","India","Indira","Indra","Ine","Ineke","Ines","Inga","Inge","Ingeborg","Ingrid","Inka","Inke","Inken","Innocentia","Innozentia","Insa","Iphigenie","Ira","Ireland","Irena","Irene","Irina","Irinka","Iris","Irma","Irme","Irmengard","Irmgard","Irmina","Irmine","Isa","Isabeau","Isabel","Isabela","Isabell","Isabella","Isabelle","Isalda","Isis","Isolda","Isolde","Isotta","Ita","Itzel","Iva","Ivana","Ivanka","Ivona","Ivonne","Ivy","Iwana","Iwanka","Iwanna","Iyana","Iyanna","Izabella","Jacalyn","Jacey","Jacinthe","Jackeline","Jackie","Jacky","Jaclyn","Jacqualine","Jacqueleen","Jacqueline","Jacquelyn","Jacquelyne","Jacquelynne","Jacquenetta","Jacquenette","Jacqui","Jada","Jade","Jaden","Jadwiga","Jadyn","Jaelyn","Jaida","Jaiden","Jaidyn","Jailyn","Jaime","Jakayla","Jaliyah","Jalyn","Jalynn","Jamie","Jamie-Lee","Jamya","Jana","Janae","Jane","Janelle","Janessa","Janet","Janette","Janice","Janie","Janika","Janina","Janine","Janiya","Janka","Jaquelin","Jaqueline","Jarvia","Jasmeen","Jasmin","Jasmina","Jasmine","Jasmyn","Jasmyne","Jaycee","Jayda","Jayde","Jayden","Jayla","Jaylene","Jaylin","Jaylyn","Jaylynn","Jazlyn","Jazmin","Jazmine","Jazmyn","Jazmyne","Jazzmine","Jazzmyn","Jean","Jeana","Jeane","Jeanee","Jeanetta","Jeanette","Jeanice","Jeanie","Jeanina","Jeanine","Jeanna","Jeanne","Jeannette","Jeannie","Jeannine","Jeanny","Jeena","Jehane","Jelena","Jelenka","Jelika","Jella","Jena","Jenette","Jenifer","Jenina","Jenine","Jenna","Jenni","Jennifer","Jennine","Jenny","Jeri","Jerica","Jessamina","Jessamine","Jessamyn","Jessica","Jessie","Jessika","Jettchen","Jette","Jewel","Jewell","Jill","Jillian","Jimena","Jineen","Joan","Joana","Joanna","Joanne","Jocelin","Jocelina","Joceline","Jocelyn","Jocelyne","Jocelynn","Joeliyn","Joell","Joella","Joelle","Joellen","Joelyn","Johana","Johanna","Joi","Joia","Joie","Jola","Jolanda","Jolande","Jolanta","Jolante","Jolantha","Jolanthe","Jolee","Joleigh","Joli","Jolie","Jolien","Jonesy","Jonna","Jordan","Jordane","Jordyn","Josalyn","Josalynn","Joscelyn","Josefa","Josefin","Josefina","Josefine","Joselyn","Josepha","Josephe","Josephina","Josephine","Josette","Josie","Josilyn","Josina","Joslin","Joslyn","Journey","Jovita","Jowita","Joy","Joy  Joyce","Joya","Joyann","Joyanna","Joyanne","Joyce","Joyelle","Jozlyn","Juana","Juanita","Judit","Judith","Juditha","Judy","Julchen","Jule","Julee","Juleen","Julia","Juliana","Juliane","Julianna","Julianne","Julie","Julienne","Juliet","Julietta","Juliette","Julika","Julissa","Julita","June","Justeen","Justice","Justina","Justine","Justyne","Jutta","Jutte","Kacie","Kaela","Kaelyn","Kaia","Kaila","Kailee","Kailey","Kailyn","Kaitlin","Kaitlyn","Kaitlynn","Kaiya","Kaleigh","Kaley","Kali","Kaliyah","Kallie","Kalyn","Kamille","Kamryn","Kara","Karcsi","Karen","Kari","Karin","Karina","Karissa","Karla","Karlee","Karley","Karli","Karlie","Karlotta","Karly","Karola","Karolin","Karolina","Karoline","Karoly","Kasandra","Kasey","Kassandra","Kassidy","Katarina","Kate","Katelin","Katelyn","Katelynn","Katerina","Katharina","Katharine","Kathe","Katherine","Kathi","Kathleen","Kathrin","Kathrina","Kathrine","Kathryn","Kathy","Katie","Katinka","Katja","Katlyn","Katriane","Katrin","Katrina","Katy","Kaya","Kayla","Kaylah","Kaylee","Kayleigh","Kayley","Kayli","Kaylie","Kaylin","Kaylyn","Kaylynn","Keeley","Keely","Keila","Keira","Kelli","Kellie","Kelly","Kelsey","Kelsi","Kelsie","Kelsy","Kemble","Kendal","Kendall","Kendra","Kenia","Kenna","Kennedi","Kennedy","Kenya","Kenzie","Kersten","Kersti","Kerstin","Keyla","Kezia","Kiana","Kianna","Kiara","Kiera","Kierra","Kiersten","Kiley","Kim","Kimball","Kimbell","Kimberley","Kimberly","Kimble","Kimby","Kimmey","Kimmi","Kimmie","Kimmy","Kira","Kirsten","Kirstin","Kiya","Klara","Klarina","Klarinda","Klarissa","Klaudia","Klementia","Klementine","Kleopatra","Klothild","Klothilde","Konstantia","Konstanza","Konstanze","Kora","Kordula","Korinna","Kornelia","Kourtney","Kriemhild","Kriemhilde","Krimhild","Krimhilde","Krista","Kristen","Kristiane","Kristin","Kristina","Krystal","Kunigunda","Kunigunde","Kunissa","Kya","Kyla","Kylee","Kyleigh","Kylie","Kym","Kymberly","Kyra","LaVergne","Lace","Lacee","Lacene","Lacey","Laci","Laciann","Lacie","Lacina","Lacy","Lacyann","Laetitia","Laila","Lana","Laney","Lara","Larissa","Laura","Laureen","Laurel","Lauren","Laurene","Laurentia","Laurenzia","Lauretta","Laurette","Laurina","Laurine","Lauryn","Lavern","Laverna","Laverne","Lavernia","Lavonne","Laycie","Layla","Lea","Leah","Leala","Lealia","Leander","Leanna","Lee","Leefka","Leefke","Lei","Leia","Leigh","Leila","Leilani","Leilena","Lela","Lena","Lenchen","Lene","Leni","Lenka","Lenore","Leoba","Leoda","Leola","Leona","Leonarda","Leonda","Leondra","Leondrea","Leone","Leonela","Leonelle","Leonie","Leonore","Leontina","Leontyne","Leopolda","Leopoldina","Leopoldine","Leota","Lesley","Leslie","Lesly","Leticia","Letje","Letya","Lexi","Lexie","Lexus","Leyla","Lia","Liana","Liane","Libby","Liberty","Lidda","Liealia","Lies","Liesel","Liesl","Lil","Lila","Lili","Lilian","Liliana","Liliane","Lilith","Lilli","Lillian","Lilliana","Lillie","Lilly","Lilo","Lily","Lina","Linchen","Linda","Lindsay","Lindsey","Line","Linette","Lioba","Liriene","Lirienne","Lisa","Lisbeth","Lise","Liselotte","Lisenka","Lisetta","Lisette","Lissette","Lissy","Litzy","Livi","Livia","Livie","Livvi","Lizbeth","Lizeth","Lizette","Lizzy","Locke","Loella","Logan","Logestilla","Logistilla","Lola","Lolo","London","Lone","Loraina","Loraine","Lorayne","Lorchen","Lore","Lorelei","Lorelia","Lorelie","Loren","Lorena","Lorenza","Loretta","Lorette","Lorin","Lorraina","Lorraine","Lottchen","Lotte","Lotye","Louanna","Louanne","Louella","Louisa","Louise","Lourdes","Love","Loveleen","Lovie","Luana","Luane","Luca","Lucette","Lucia","Luciana","Luciane","Lucie","Lucienne","Lucile","Lucilla","Lucille","Lucrece","Lucy","Ludmila","Ludmilla","Luella","Luelle","Luisa","Luise","Lukretia","Lulu","Luna","Lundy","Lunette","Lupe","Lurleen","Luwana","Luwanna","Luwanne","Luz","Luzia","Luzie","Lydia","Lydie","Lyndsey","Lynette","Lynn","Lynn-Marie","Lynnette","Lyonette","Lyra","Lyric","Mabelle","Macee","Macey","Maci","Macie","Mackenzie","Macy","Madalene","Madalyn","Madalynn","Maddison","Maddy","Madeleina","Madeleine","Madelina","Madeline","Madelon","Madelyn","Madelynn","Madie","Madilyn","Madisen","Madison","Madisyn","Madita","Madlen","Madolen","Mady","Madyson","Mae","Maegan","Maelee","Maelynn","Maeve","Mafalda","Magda","Magdalen","Magdalena","Maggie","Maggy","Magnolia","Mai","Maia","Maida","Maidel","Maidie","Maidy","Maika","Maike","Maiken","Maiolaine","Maira","Mairin","Maisie","Maitane","Maiya","Maja","Majori","Makaila","Makayla","Makena","Makenna","Makenzie","Malchen","Male","Maleah","Malenka","Malia","Malica","Malin","Malina","Maliyah","Mallorie","Mallory","Manda","Mandy","Manette","Manhattan","Mania","Manja","Manjana","Manny","Manon","Manuela","Manuella","Mara","Marcelin","Marcelina","Marceline","Marcella","Marcelle","Marcellia","Marcellina","Marchelle","Marcie","Maree","Mareen","Marei","Mareike","Marelda","Maren","Marene","Marga","Margaret","Margareta","Margarete","Margaretha","Margarita","Margaux","Margeaux","Margery","Margit","Margo","Margot","Margret","Marguerite","Maria","Mariah","Mariam","Marian","Mariana","Mariane","Marianna","Marianne","Maribel","Marie","Mariechen","Mariela","Mariele","Mariella","Marielle","Marietta","Mariette","Marija","Marika","Marike","Marilena","Marilyn","Marina","Marinka","Marion","Mariona","Marionna","Marisa","Marisol","Marissa","Marit","Maritza","Marjolaina","Marlee","Marlene","Marley","Marlis","Marlon","Marquisa","Marquise","Marquisha","Marta","Marteena","Martha","Martina","Martine","Marveille","Marvela","Marvella","Marvelle","Mary","Maryam","Maryl","Maryvonne","Maschinka","Masha","Mateja","Mathilda","Mathilde","Matilda","Matilde","Mattie","Matty","Maud","Maude","Maura","Maureen","Maurelle","Maurina","Maurine","Mavis","Mavise","Maxime","Maxine","May","Maya","Mayda","Mayra","Mckayla","Mckenna","Mckenzie","Meadow","Meagan","Meaghan","Mechthild","Mechthilde","Mechtild","Megan","Meghan","Meika","Meike","Meiken","Mela","Melaina","Melaine","Melanee","Melania","Melanie","Melany","Melina","Melinda","Meline","Melisande","Melissa","Melitta","Melodie","Melody","Melusina","Mercedes","Mercer","Merci","Mercy","Meredith","Meret","Meriel","Merla","Merle","Merlyn","Merryl","Meryl","Meta","Meyla","Mia","Mia  Miah","Miah","Micaela","Micah","Michaela","Michela","Michele","Micheline","Michella","Michelle","Mieke","Miette","Mignon","Mignonette","Mikaela","Mikayla","Milena","Milina","Millicent","Millicente","Millie","Milva","Mimi","Mina","Minchen","Minda","Mindy","Mine","Minerva","Minetta","Minette","Mingo","Minna","Minne","Minnie","Minta","Mira","Mirabell","Mirabella","Mirabelle","Miracle","Miranda","Mireille","Mirella","Mireya","Miriam","Mirielle","Mirjam","Mirla","Mirth","Missie","Missy","Missye","Mistee","Mistey","Mistique","Misty","Miya","Mollie","Molly","Mona","Mone","Moni","Monica","Monika","Moniqua","Monique","Monja","Monserrat","Montana","Moreen","Morgan","Moriah","Munira","Muriel","Musetta","Musette","Mya","Myah","Mychele","Mychelle","Myra","Myrla","Myrna","Mystique","Nada","Nadeen","Nadia","Nadina","Nadine","Nadinka","Nadja","Nadjeschda","Naeva","Nafia","Naima","Nan","Nancey","Nanci","Nancie","Nancy","Nane","Nanette","Nanine","Nann","Nannerl","Nannette","Nanni","Nanon","Naomi","Naomy","Nara","Narcisse","Nastasia","Nastjenka","Nata","Natalee","Natalia","Natalie","Natalii","Nataly","Natascha","Natasha","Natassja","Nathalee","Nathalia","Nathalie","Nathaly","Natuche","Nayeli","Neeske","Neisa","Nele","Nella","Nelli","Nelly","Nesrin","Nessie","Nettchen","Netti","Nevaeh","Nia","Nichol","Nichole","Nicki","Nicky","Nicola","Nicole","Nicoletta","Nicolette","Nicoline","Nicolle","Nikki","Nikoletta","Nikolina","Nikoline","Nila","Nina","Ninette","Ninon","Nissie","Nissy","Nixie","Noa","Noel","Noele","Noelia","Noell","Noella","Noelle","Noemi","Noemie","Nora","Norberta","Norberte","Norbertha","Norberthe","Nordica","Norma","Nuria","Nya","Nyah","Nyasia","Nyla","Nynette","Odalys","Odeletta","Odelette","Odetta","Odette","Odila","Odile","Odilia","Olave","Olga","Olive","Olivia","Ollie","Olva","Olympe","Olympia","Olympie","Oola","Ophelia","Ophelie","Orane","Orania","Oriel","Orla","Orlanda","Orlande","Orlena","Orlene","Orlina","Ornella","Orsina","Orsine","Orsola","Orsolya","Ortelia","Orva","Ottilia","Ottilie","Oxana","Page","Paige","Palma","Palmiera","Palmira","Palmyra","Paloma","Pamela","Pamelina","Pandora","Pansy","Paola","Paris","Parker","Parnella","Pascala","Pascale","Pascaline","Pasclina","Patience","Patrice","Patricia","Patrizia","Paula","Pauletta","Paulette","Paulina","Pauline","Pawla","Payton","Pearl","Peggy","Penelope","Penny","Pensee","Pepi","Perla","Petra","Peyton","Philina","Philine","Philippa","Philippe","Philippina","Philippine","Phillipa","Philomela","Philomele","Philomena","Philomene","Phinchen","Phoebe","Pia","Pia-Marie","Piera","Pierretta","Pierrette","Pilar","Piper","Pleasance","Poppy","Precious","Presley","Princess","Prisca","Priscila","Priscilla","Priska","Priszilla","Prunella","Prunellie","Pyper","Queena","Quendolin","Questa","Quinn","Rabea","Rabia","Rachael","Rachel","Rachele","Rachelle","Rachil","Radella","Radmila","Radmilla","Radomila","Raegan","Raffaela","Rahel","Raina","Raison","Raissa","Rama","Ramona","Ramonda","Raphaela","Raphaele","Raquel","Ratna","Raven","Raymonda","Raymonde","Rayna","Rea","Reagan","Reanna","Rebeca","Rebecca","Rebekah","Rebekka","Recha","Reese","Regan","Regina","Regine","Regula","Reilly","Reina","Reine","Relyea","Renata","Renate","Rene","Renee","Reyna","Rhea","Rhiannon","Ria","Riana","Rianna","Rica","Ricarda","Richarda","Richelle","Rickie","Ricky","Rieke","Rikchen","Rike","Riley","Rilla","Rille","Rillette","Rita","Riva","Rive","Riya","Ro","Robbin","Roberta","Roberte","Robertina","Robin","Robina","Robine","Robinetta","Robinette","Robyn","Rocio","Roddie","Roddy","Roderica","Rodericka","Roesia","Rohais","Roial","Rola","Rolanda","Rolande","Romaine","Romana","Romhilda","Romhilde","Romilda","Romilde","Romy","Ronalda","Ronalde","Ronja","Ronnie","Ronny","Rosa","Rosalba","Rosalie","Rosalinde","Rosamonde","Rosamunde","Rosanna","Rose","Rosegrethe","Rosella","Rosellina","Rosemarie","Rosemary","Rosi","Rosina","Rosine","Rosita","Roswita","Roswitha","Roterica","Roux","Rownan","Roxana","Roxane","Roxanne","Roya","Royale","Rubie","Ruby","Rudella","Rudelle","Ruperta","Rut","Ruth","Ryan","Ryann","Rylee","Ryleigh","Rylie","Sabina","Sabine","Sabrina","Sade","Sadie","Sage","Sahra","Saige","Salene","Sally","Salma","Salome","Salvina","Salwa","Samantha","Samara","Samira","Sandra","Sandria","Sandrina","Sandrine","Sandy","Sanetra","Sanne","Saphira","Sara","Sarah","Sarahi","Sarai","Sarina","Sascha","Sasha","Saskia","Sasna","Satin","Savana","Savanah","Savanna","Savannah","Saxona","Scarlet","Scarlett","Searlait","Selby","Selden","Seldon","Selena","Selene","Selima","Selina","Selma","Selwin","Selwyn","Serafin","Serafina","Seraphin","Seraphina","Seraphine","Serena","Serenity","Serfine","Serhilda","Serhilde","Serilda","Serilde","Shakira","Shalina","Shalyna","Shana","Shandy","Shania","Shanice","Shaniya","Shannon","Shantala","Shanton","Sharla","Sharleen","Sharlene","Sharon","Shawna","Shayla","Shaylee","Shayna","Shea","Sheila","Shelby","Sherey","Sherlie","Sheryl","Sheyla","Shir","Shirl","Shirlee","Shirleen","Shirleigh","Shirley","Shreya","Shurl","Shurlie","Shyann","Shyanne","Sibilla","Sibille","Sibyla","Sibylla","Sibylle","Sidney","Sidonia","Sidonie","Sienna","Sierra","Sigfreda","Sigfrieda","Sigfriede","Sigrid","Sigrun","Silana","Silja","Silka","Silke","Silvana","Silvetta","Silvette","Silvia","Silvina","Simona","Simone","Simonetta","Simonette","Sina","Sinja","Sinje","Sissi","Sky","Skye","Skyla","Skylar","Skyler","Slainie","Slania","Slanie","Sofia","Sofie","Solaina","Solaine","Solange","Solvig","Sonia","Sonja","Sonya","Sophia","Sophie","Soreen","Sorren","Stacey","Stacy","Stefana","Stefania","Stefanie","Steffi","Stella","Stephania","Stephanie","Stephany","Stina","Stine","Storm","Storme","Stormie","Stormy","Suleima","Summer","Susan","Susana","Susane","Susanna","Susanne","Suse","Susen","Susi","Susie","Suzanne","Suzette","Suzy","Svana","Svea","Svenja","Swantje","Swea","Swenja","Sydnee","Sydney","Sydni","Sydnie","Sylke","Sylvia","Sylvie","Tabea","Tabitha","Tait","Taite","Taitum","Talia","Talida","Talika","Taliyah","Tallis","Tamar","Tamara","Tamia","Tamira","Tania","Tanita","Taniya","Tanja","Tanjura","Tanya","Tara","Tara-Ann","Taryn","Tat","Tatiana","Tatjana","Tatum","Tatyana","Tavia","Taya","Tayler","Taylor","Tayte","Teagan","Teite","Tempeste","Teresa","Terese","Tereza","Tess","Tessa","Thabita","Thalia","Thea","Theodora","Theres","Theresa","Therese","Theresia","Theresina","Thery","Thilde","Thistle","Tia","Tiana","Tianna","Tiara","Tibelda","Tierra","Tiffanie","Tiffany","Tiffney","Tilda","Tilly","Timea","Tina","Tinchen","Tine","Tinette","Tizia","Tiziana","Tokessa","Toni","Tonja","Tori","Tosca","Toska","Tracy","Trine","Trinetta","Trinette","Trinity","Trista","Tristan","Trix","Trixi","Tru","Trudchen","Trude","Trudel","Trudi","Trudie","Trudy","Tuesday","Tyler","Tyra","Uda","Udele","Udella","Udelle","Uka","Ula","Ulita","Ulitta","Uljana","Ulla","Ulli","Ulrica","Ulrika","Ulrike","Ulva","Undine","Unique","Urania","Urith","Ursel","Ursina","Ursine","Ursula","Urte","Uschi","Uta","Ute","Vafara","Vala","Valborga","Valburga","Valda","Valentina","Valentine","Valeraine","Valere","Valeri","Valeria","Valeriana","Valeriane","Valerie","Valerien","Valeska","Valida","Vallerie","Vanadis","Vanesa","Vanessa","Vania","Vanja","Vanni","Varinka","Vedetta","Velda","Velma","Veloy","Veneta","Venetia","Venetta","Venus","Vera","Verena","Verona","Verone","Veronica","Veronika","Veronique","Vicky","Victoria","Victorina","Victorine","Vignetta","Vignette","Viktoria","Viktorin","Viktorina","Viktorine","Villetta","Villette","Vina","Vineta","Vinka","Viola","Violet","Violett","Violetta","Violette","Viollette","Virginia","Virginie","Vittoria","Vivian","Viviana","Viviane","Vivien","Vivienne","Voleta","Voletta","Vroni","Walborga","Walburg","Walburga","Walburge","Walda","Waldburg","Walli","Wally","Walpurgis","Waltraud","Wanda","Wandie","Wandis","Wanja","Warda","Warenka","Welda","Wencke","Wenda","Wendeline","Wendy","Wenke","Whitney","Wiba","Wibeke","Wibke","Wiebke","Wigberta","Wileen","Wilf","Wilfiede","Wilfreda","Wilfreida","Wilfrieda","Wilhelma","Wilhelmina","Wilhelmine","Willa","Willow","Wilma","Wilona","Winifred","Winifrieda","Winnie","Winny","Winola","Winona","Winter","Xandra","Xaveria","Xaverine","Xaviere","Xavierra","Xavierre","Xena","Xenia","Ximena","Xiomara","Yadira","Yamina","Yara","Yaren","Yasmin","Yasmina","Yasmine","Yazmin","Yedda","Yelena","Yesenia","Yessenia","Yetta","Ynes","Ynez","Yola","Yoland","Yolanda","Yolande","Yolanthe","Yolonda","Ysabel","Yseult","Yuliana","Yuria","Yvette","Yvonna","Yvonne","Zaida","Zaina","Zara","Zarah","Zaria","Zeider","Zelda","Zena","Zenobia","Zenzi","Zerelda","Zerla","Zerlina","Zerline","Zilli","Zina","Zoe","Zoey","Zoie","Zorra","Zuri","Zuria","Zurie"};
		int rnd = (int) Math.floor(Math.random() * namesFemale.length);
		String names= namesFemale[rnd];
			return names;
		}

		private static String HumanMFNames() {
			// TODO Auto-generated method stub
		String[] namesMale = {"Delmon","Karcsi","Quesnel","Aaron","Abdiel","Abdullah","Abel","Abelard","Abilo","Abraham","Abram","Acel","Achille","Achilles","Achilleus","Achim","Achmed","Ackerley","Ackley","Acton","Adalard","Adalbero","Adalbert","Adalbrecht","Adalwine","Adam","Adan","Addi","Addisen","Addison","Adelard","Adelbert","Adelfo","Aden","Adger","Adhelard","Adi","Adison","Aditya","Adolf","Adolfo","Adolph","Adonai","Adonija","Adonis","Adray","Adrian","Adrianus","Adriel","Adrien","Advent","Ageline","Agrican","Agron","Agustin","Ahmad","Ahmed","Aidan","Aiden","Aiken","Ailen","Akim","Alain","Alan","Albaric","Albero","Albert","Alberto","Albin","Albrecht","Alcot","Alcott","Alden","Alder","Aldo","Aldred","Aldren","Aldrich","Aldrick","Aldridge","Aldrych","Aldwin","Aldwyn","Alec","Alejandro","Aleron","Alessandro","Alessio","Alex","Alexander","Alexandre","Alexandro","Alexei","Alexis","Alexzander","Alf","Alfie","Alfons","Alfonse","Alfonso","Alfred","Alfredo","Alfric","Alfrid","Algar","Alger","Algernon","Algrenon","Ali","Alijah","Alke","Alkuin","Alkwin","Allan","Allard","Allen","Allie","Allon","Allston","Allvar","Aloin","Alois","Aloisius","Alon","Alonso","Alonzo","Aloys","Alphons","Alphonse","Alphonso","Alphonsus","Alric","Altfried","Altman","Alton","Aluin","Alvan","Alvaro","Alvertos","Alvin","Alvis","Alvord","Alvyn","Alwin","Alwyn","Amadeo","Amadeus","Amari","Amarion","Amaud","Amaury","Ambert","Amel","Amerigo","Amery","Ames","Amey","Amir","Ammon","Amo","Amory","Amos","Amou","Amoux","Amsden","Anatol","Anatole","Anaxagoras","Anaximander","Ancel","Ancil","Anderl","Anderson","Andor","Andre","Andrea","Andreas","Andrei","Andres","Andrew","Andrey","Andrick","Andrijan","Andrin","Andy","Angel","Angelico","Angelino","Angelo","Angelus","Angus","Anno","Anse","Ansel","Ansell","Anselm","Anselme","Ansgar","Anshelm","Ansko","Ansley","Answald","Anthony","Antoine","Anton","Antonio","Antonius","Antony","Antwan","Aramis","Arber","Arcadius","Arch","Archaimbaud","Archambault","Archard","Archenhaud","Archer","Archerd","Archibald","Archie","Archimbald","Archy","Arden","Arendt","Ari","Arian","Aribert","Ariel","Arjen","Arjun","Arledge","Arley","Arlo","Armand","Armande","Armando","Armani","Armin","Arminius","Armond","Armstrong","Arnald","Arnaldo","Arnall","Arnatt","Arnaud","Arndell","Arndt","Arne","Arnet","Arney","Arnhold","Arnie","Arnim","Arno","Arnold","Arnott","Aron","Arthur","Artur","Arturo","Artus","Arundel","Arvie","Arvin","Arvis","Arvon","Arwin","Aryan","Asa","Ascelin","Asher","Ashley","Ashton","Asterios","Athelstan","Attila","Auberon","Aubert","Aubin","Aubrey","Aubry","Audric","Audwin","August","Augustin","Augustinus","Augusto","Augustus","Auhert","Aurélien","Aurel","Aurelian","Aurelianus","Aurelius","Auriville","Austen","Austin","Austyn","Avenall","Aveneil","Avenelle","Avent","Averill","Avery","Awarnach","Axel","Ayden","Baby","Bailey","Baldemar","Baldo","Baldric","Balduin","Baldus","Baldwin","Balko","Ballard","Balthasar","Balthassar","Bancroft","Baptist","Baptiste","Barclay","Barden","Barklay","Barkley","Barks","Barksdale","Barnabas","Barnard","Barnet","Barnett","Baron","Barr","Barret","Barrett","Barrie","Barron","Barry","Bart","Barthel","Bartholomaeus","Bartlett","Bartram","Baruch","Bas","Basil","Bast","Bastian","Bastle","Battist","Battista","Baudouin","Baudric","Bax","Baxter","Bay","Bayard","Baylen","Bayley","Beacher","Beal","Beale","Beall","Beaman","Beardsley","Beau","Beaufort","Beauregard","Beauvais","Bede","Beldon","Bell","Bellamy","Ben","Bendix","Benedict","Benedikt","Benediktus","Bengt","Beni","Benito","Benjamin","Benjamino","Bennet","Bennett","Benno","Benny","Beno","Bente","Bentley","Beppo","Berenger","Bergen","Bergess","Berit","Berkeley","Berkley","Bernard","Bernardo","Bernd","Berne","Bernhard","Bernhardt","Bernie","Bernt","Berny","Bert","Berthold","Berthoud","Berti","Bertie","Bertold","Bertolt","Berton","Bertram","Bertran","Bertrand","Berty","Bevis","Bilal","Billy","Bing","Birch","Björn","Bjarne","Bjorn","Blade","Blaine","Blais","Blaisdell","Blaise","Blaize","Blake","Blase","Blayze","Blaze","Bo","Bob","Bobby","Bobby-Jo","Bodil","Bodin","Bodo","Bogart","Bogdan","Bolton","Bond","Bonham","Boniface","Bonifacius","Bonifatius","Bonifaz","Booker","Boone","Booth","Boothe","Bordan","Borden","Boris","Borris","Bosco","Bosse","Bosso","Both","Botho","Boto","Boyce","Bozo","Brad","Braden","Bradford","Bradley","Bradly","Bradney","Brady","Bradyn","Braeden","Braedon","Braid","Braiden","Bran","Brand","Branden","Brandon","Branford","Brant","Braulio","Braxton","Bray","Brayan","Brayden","Braydon","Brayton","Brecht","Brendan","Brenden","Brendon","Brennan","Brennen","Brent","Brentan","Brenton","Bret","Brett","Brewster","Brian","Brice","Brigham","Brinley","Brisco","Brock","Brocton","Brod","Broderick","Brodie","Brody","Bromley","Bromwell","Bromwood","Bronson","Bronwen","Bronwyn","Brook","Brooks","Bruce","Brunelle","Bruno","Bryan","Bryant","Bryce","Brycen","Brys","Bryson","Buckley","Bud","Buiron","Burcet","Burdett","Burdette","Burel","Burg","Burgess","Burghard","Burkhard","Burkhart","Burley","Burne","Burns","Burt","Burton","Buster","Byrne","Byron","Cade","Caden","Cadwell","Cael","Caiden","Cain","Caio","Cal","Calder","Caldwell","Cale","Caleb","Calhoun","Calliste","Callixtus","Calvert","Calvin","Camden","Cameron","Camren","Camron","Carden","Carel","Carl","Carleton","Carlisle","Carlo","Carlos","Carlton","Carlyle","Carol","Carolos","Carolus","Carrington","Carson","Carsten","Carter","Carvell","Carver","Casey","Casimir","Cason","Caspar","Castor","Catcher","Caulder","Cayden","Cearbhall","Cecco","Cedric","Celestino","Cerdic","Cesar","Chad","Chadwick","Chaim","Chance","Chandler","Chane","Chaney","Chanler","Channing","Chapin","Chapman","Chappel","Chappell","Charles","Charley","Charlie","Charlot","Charlton","Charly","Chase","Chaunce","Chauncey","Chauncy","Chayne","Chaz","Cheney","Cheval","Chevalier","Chevell","Chevy","Cheyne","Chilton","Chip","Choncey","Chrestien","Chris","Christian","Christien","Christinus","Christofor","Christoph","Christophe","Christopher","Christopherus","Chuck","Claas","Claiborne","Clarence","Clark","Claudde","Claude","Claudio","Claudius","Claus","Clay","Clayton","Cleavon","Clemens","Clement","Cleopas","Cleve","Cleveland","Cliff","Clifford","Clifton","Clint","Clinton","Clive","Clovis","Coby","Cody","Cohen","Colan","Colbert","Colbey","Colborn","Colby","Cole","Coleman","Colin","Coljar","Collin","Collins","Colt","Colten","Colter","Colton","Colyn","Con","Conner","Conni","Connie","Connor","Conny","Conor","Conrad","Constantin","Constantinus","Cooper","Copper","Corben","Corbett","Corbin","Corbinian","Corby","Corbyn","Cordalles","Cordell","Corey","Corin","Cornelio","Cornelius","Cort","Cortez","Cortland","Corvin","Cory","Court","Courtenay","Courtland","Courtnay","Courtney","Coyan","Coyne","Craig","Crawford","Creighton","Cretien","Cristian","Cristobal","Cristopher","Cromwell","Cruz","Cullen","Curcio","Currier","Curt","Curtice","Curtis","Curtiss","Cynric","Cyrano","Cyrill","Cyrillus","Cyrus","D'Arcy","D'anton","D'arcy","Dabbert","Dace","Dacey","Dacian","Dag","Dagobert","Daine","Dakota","Dale","Dallas","Dallin","Dalton","Damian","Damiano","Damien","Damion","Damon","Dan","Dandelion","Dandre","Dane","Dangelo","Daniel","Danilo","Danniell","Danny","Dante","Danton","Daquan","Darcel","Darcell","Darcio","Darcy","Dareau","Darek","Darian","Dariel","Dariell","Darien","Darin","Dario","Darion","Darius","Darko","Darnell","Darrel","Darrell","Darren","Darrin","Darrion","Darrius","Darroll","Darryl","Darryll","Dartagnan","Darvell","Darwin","Darwyn","Daryl","Daryll","Dash","Dashawn","Dashiell","Dave","Davet","David","Davin","Davion","Davis","Davon","Davy","Dawson","Dax","Dayadi","Dayne","Dayton","Dean","Dean Deandre","Deangelo","Declan","Dedrick","Del","Delaine","Delancy","Delane","Delaney","Delano","Delmar","Delmer","Delmont","Delmore","Delray","Delrick","Delrico","Delron","Delroy","Demarcus","Demetrius","Dempster","Denis","Deniz","Dennet","Dennis","Denton","Denver","Denys","Denzel","Deon","Deonte","Derck","Dereck","Derek","Derell","Derick","Derik","Derk","Derrall","Derrek","Derrell","Derrick","Derrik","Derrill","Derry","Derwood","Deryck","Deryk","Deshaun","Deshawn","Desmond","Desmund","Destan","Destin","Deston","Destrey","Destrie","Destry","Detlef","Detlev","Devan","Devante","Deven","Deveral","Devere","Devereau","Devereaux","Deverel","Deverell","Deverick","Devery","Devin","Devon","Devonte","Devry","Devyn","Dexter","Diandre","Dicken","Dickens","Dickenson","Dickinson","Didier","Diederich","Diedrich","Diego","Dieter","Diether","Dietmar","Dietrich","Digby","Dilan","Dillan","Dillen","Dillon","Dimitri","Dimitrij","Dion","Diondre","Dionte","Dirk","Ditmar","Dittmar","Dix","Dixie","Dixon","Dob","Dobbs","Dolf","Dolph","Domenic","Domenico","Domian","Domingo","Dominic","Dominick","Dominik","Dominikus","Dominique","Don","Donald","Donat","Donatello","Donatien","Donato","Donatus","Donavan","Dondre","Donny","Donovan","Dontae","Donte","Dorian","Dorkas","Dorset","Dorsey","Douglas","Dover","Doyle","Doyt","Dragan","Drago","Drake","Draven","Drew","Dru","Duane","Dudley","Dudly","Dumont","Duncan","Dunstan","Duran","Durand","Durango","Durant","Durante","Dureau","Duron","Durrant","Durwald","Durward","Durwin","Durwood","Dustin","Duston","Dusty","Dustyn","Duval","Dwayne","Dwenn","Dwennon","Dwight","Dwighte","Dwite","Dwyght","Dwyghte","Dwyte","Dylan","Dylon","Ean","Earl","Easton","Eaton","Ebbo","Eberhard","Eckart","Eckbert","Eckehart","Ed","Eddie","Eddy","Ede","Edel","Edelhart","Edgar","Edgard","Edgardo","Edmar","Edmon","Edmond","Edmund","Edmundo","Edo","Edsel","Eduard","Eduardo","Edvard","Edward","Edwardo","Edwards","Edwardson","Edwin","Efraim","Efrain","Efrem","Efren","Egan","Egbert","Egbrecht","Egerton","Egidius","Egnatius","Egon","Ehrhard","Eicren","Eike","Ekbrecht","Elbert","Elbridge","Elden","Elder","Eldon","Eldridge","Eleasar","Eleazar","Elery","Elfred","Eli","Elia","Elian","Elias","Eliezer","Elija","Elijah","Eliot","Eliott","Eliseo","Elisha","Ellerey","Ellery","Elliot","Elliott","Ellis","Elman","Elmar","Elmer","Elmo","Elmore","Elon","Eloy","Elric","Elroy","Elten","Elton","Elvin","Elvis","Emanuel","Emersen","Emerson","Emery","Emil","Emile","Emiliano","Emilio","Emlyn","Emmanuel","Emmerich","Emmerson","Emmery","Emmett","Emmyrson","Emory","Emyrson","Endrik","Enes","Engelbert","Engelbrecht","Englebert","Ennio","Enno","Enrico","Enrique","Enzio","Ephraim","Eppie","Eppo","Erhard","Eric","Erich","Erick","Erik","Eriq","Ermin","Ernest","Ernesto","Ernst","Errol","Erskine","Erwin","Esau","Escott","Esmond","Esmund","Esra","Esteban","Estevan","Ethan","Ethelbert","Ethelred","Ethen","Etienne","Eufemio","Eugen","Eugene","Euphemius","Evan","Everett","Ewald","Ewart","Ewing","Eyvind","Ezechiel","Ezekiel","Ezequiel","Ezra","Fabian","Fabiano","Fabianus","Fabien","Fabio","Fabius","Fairfax","Fairleigh","Fairley","Falk","Falko","Farald","Faralt","Faramond","Farand","Farant","Farland","Farley","Farly","Farold","Farolt","Farrand","Farrell","Faruk","Faust","Faustino","Faustinus","Fausto","Faustus","Federico","Federigo","Fedor","Felipe","Felix","Felizian","Ferd","Ferdel","Ferdi","Ferdie","Ferdinand","Ferdinando","Ferdy","Fernand","Fernando","Ferrand","Fester","Fidel","Fidelio","Fidelis","Fidelius","Fielding","Fiete","Filip","Filippo","Filiz","Finn","Fitz","Fleming","Flemming","Fletcher","Florens","Florentin","Florentinus","Florentus","Florenz","Florestan","Flori","Florian","Florianus","Floridus","Florin","Floris","Florus","Floyd","Flurin","Folker","Folkher","Folkmar","Fontaine","Fontane","Fontayne","Fonteyne","Forbes","Ford","Forrest","Fortun","Fortune","Francesco","Francis","Francisco","Franciscus","Francois","Franek","Frank","Franke","Frankie","Franklin","Franko","Franky","Frantisek","Franz","Franziskus","Fred","Freddie","Freddy","Frederic","Frederick","Fredi","Fredrick","Free","Freidhelm","Freman","Fremont","Fridericus","Fridolin","Friedel","Frieder","Friedl","Friedrich","Frithjof","Fritjof","Fritz","Fulbert","Fulbright","Fuller","Fulton","Fynn","Görkem","Günter","Günther","Gabor","Gabriel","Gabriele","Gabriello","Gabrio","Gace","Gael","Gaetan","Gage","Gaige","Gaillard","Gall","Galli","Gallo","Gallus","Gannon","Garan","Gard","Gardiner","Garen","Garett","Garfield","Garin","Garion","Garlan","Garland","Garlen","Garlyn","Garnell","Garner","Garnet","Garnier","Garon","Garren","Garret","Garrett","Garrick","Garrin","Garrison","Garron","Garryson","Garvin","Gary","Garyson","Gascon","Gaspar","Gaspard","Gaston","Gauthier","Gautier","Gaven","Gavin","Gavyn","Gaylord","Gebbo","Gebert","Gebhard","Gedeon","Geffrey","Gehrt","Geof","Geoff","Geoffrey","Georg","George","Georgio","Geppert","Ger","Gerald","Gerard","Gerardo","Gerd","Gere","Gereon","Gerfried","Gerhard","Gerhardt","Gerhart","Gerion","Germain","German","Germano","Gero","Gerold","Gerome","Geron","Geronimo","Gerrald","Gerrard","Gerrell","Gerrit","Gerry","Gert","Gervais","Gervase","Gerwald","Gerwin","Giacomo","Gian","Gian-Franco","Gian-Luca","Gian-Marco","Giancarlo","Gianni","Gideon","Gidi","Gidion","Gieselherr","Giffard","Gifferd","Gifford","Gil","Gilbert","Gilberto","Gilford","Gill","Gilleasbuig","Gilles","Gillian","Gino","Giovanni","Giovanny","Gironimo","Giso","Giuliano","Giulio","Giuseppe","Glen","Glenn","Godard","Godart","Goddard","Goddart","Godfrey","Goeran","Goldman","Goliat","Goliath","Gonzalo","Goran","Gordon","Gorius","Goswin","Gotbert","Gotfrid","Gottfried","Gotthard","Gotthold","Gottlieb","Gower","Graciano","Grady","Graeme","Graham","Granger","Grant","Granville","Gratian","Gratianus","Gray","Grayson","Graziano","Gregor","Gregorio","Gregory","Grenville","Greyson","Griffin","Grigor","Grimbald","Grischa","Griswold","Grosvenor","Guadalupe","Gualtiero","Guarniero","Guido","Guifford","Guillaume","Guillermo","Gunar","Gunnar","Gunner","Guntar","Gunter","Gunthar","Gunther","Guntram","Gustaf","Gustav","Gustave","Gustavo","Gustl","Guy","Hacket","Hackett","Hadden","Haden","Hadley","Hadrian","Hadrianus","Hagen","Hagley","Haiko","Haimo","Haines","Haio","Hajo","Hakan","Hakon","Halbert","Haley","Hall","Hallam","Halsey","Halton","Hamelin","Hamelyn","Hamilton","Hamlet","Hamlin","Hamlyn","Hamza","Hanibal","Hannecke","Hannes","Hannibal","Hanniel","Hanno","Hans","Hans-Jorg","Hans-Peter","Hans-carl","Hansi","Harald","Harbert","Harbin","Harcourt","Harden","Hardey","Hardi","Hardie","Hardmod","Hardouin","Hardy","Harlan","Harland","Harley","Harlon","Harm","Harman","Harmen","Harmon","Harold","Harper","Harri","Harrison","Harry","Hartmod","Hartmut","Harv","Harvey","Hasan","Hasko","Hassan","Hastings","Hauke","Havel","Hawel","Hawk","Hawthorne","Hayden","Haydon","Hayes","Hayo","Haywood","Heath","Hector","Hedley","Heiko","Heimo","Hein","Heiner","Heini","Heino","Heinrich","Heinz","Heio","Hektor","Helge","Helgo","Helias","Helke","Hellmut","Hellmuth","Helmi","Helmo","Helmut","Helmuth","Hendrick","Hendrik","Henley","Henning","Henno","Henri","Henrick","Henricus","Henrik","Henry","Herbert","Heribert","Heriberto","Herman","Hermann","Hernando","Herrick","Herrmann","Herve","Herwin","Hesekiel","Hewett","Heymo","Hias","Hieronymus","Hildebrand","Hilliard","Hillier","Hillyer","Hilton","Hinnerk","Hinz","Hippokrates","Hobart","Holden","Holdger","Holge","Holger","Hollis","Holm","Horst","Horton","Houston","Howard","Howe","Hubert","Hubertus","Hudson","Huey","Hugbert","Hugh","Hugo","Hulbard","Hulbert","Hulburd","Hulh","Hulk","Humbert","Humberto","Humbie","Humfrey","Humfry","Humph","Humphrey","Hunt","Hunter","Huntley","Huprecht","Hurlbart","Hurlbert","Hurn","Hutton","Hyatt","Ian","Ibrahim","Ignace","Ignacio","Ignatius","Ignatz","Ignaz","Ignazio","Igor","Ildiko","Ilja","Immanuel","Immo","Inglebert","Ingmar","Ingo","Ingomar","Ingraham","Ingram","Ingwar","Innocentius","Innozenz","Iram","Irvin","Irving","Irwin","Isaac","Isaak","Isai","Isaiah","Isaias","Ischell","Isiah","Isidor","Isidorius","Ismael","Ismail","Israel","Isreal","Issac","Ivan","Iven","Ives","Ivo","Iwan","Izaiah","Jörg","Jörn","Jürgen","Jabari","Jace","Jack","Jackson","Jacky","Jacob","Jacobus","Jacoby","Jacque","Jacquelin","Jacques","Jaden","Jadon","Jadyn","Jaeden","Jagger","Jaheem","Jaheim","Jahiem","Jahn","Jaiden","Jaime","Jair","Jairo","Jake","Jakie","Jakob","Jakobe","Jakobus","Jalen","Jamal","Jamar","Jamari","Jamel","James","Jameson","Jamie","Jamil","Jamir","Jamison","Jan","Jan-Martin","Janek","Janko","Jannes","Jannik","Jannis","Janosch","Janus","Janusz","Jaquan","Jaquez","Jared","Jaren","Jarman","Jaro","Jarod","Jaromil","Jaromir","Jaron","Jarred","Jarrett","Jarrod","Jarv","Jarvey","Jarvis","Jascha","Jase","Jasmin","Jason","Jasper","Javen","Javier","Javion","Javon","Jaxon","Jaxson","Jaxson  Jay","Jay","Jayce","Jayden","Jaydon","Jaye","Jaylan","Jaylen","Jaylin","Jaylon","Jayson","Jean","Jean Baptiste","Jean-Baptiste","Jean-Carlo","Jean-Christophe","Jean-Claude","Jean-Luca","Jean-Marie","Jean-Pierre","Jeff","Jeffers","Jefferson","Jeffery","Jeffrey","Jefrem","Jehudi","Jendrich","Jendrick","Jendrik","Jenik","Jens","Jeoffroi","Jerard","Jeremia","Jeremiah","Jeremias","Jeremy","Jerker","Jermaine","Jeroen","Jeroma","Jerome","Jeronimus","Jerrit","Jerrold","Jerry","Jervis","Jesaja","Jesajas","Jesekiel","Jesper","Jesse","Jessie","Jesus","Jett","Jevon","Jim","Jimmy","Jo","Joachim","Joan","Joaquin","Jobst","Jochen","Jochim","Joe","Joel","Joey","Johan","Johann","Johannes","John","John-paul","Johnathan","Johnathon","Johnn","Johnnie","Johnny","Johnson","Jolie","Jon","Jona","Jonah","Jonas","Jonatan","Jonathan","Jonathon","Jonko","Jonn","Jonnie","Jordan","Jorden","Jordis","Jordon","Jordy","Jorg","Jorge","Joris","Jose","Josef","Joseph","Josh","Joshua","Josiah","Josias","Jost","Josua","Josue","Jourdan","Jovan","Jovani","Jovany","Joy","Joyanna","Juan","Juanito","Judah","Jude","Juhani","Jul","Jules","Julian","Julianus","Julien","Julio","Julius","Jullien","Junior","Juniper","Jupp","Jurgen","Juri","Jussuf","Justice","Justin","Justinian","Justinianus","Justinus","Justus","Justyn","Kaarle","Kaarlo","Kade","Kaden","Kadin","Kadir","Kai","Kai-Olaf","Kai-Uwe","Kaiden","Kain","Kale","Kaleb","Kalle","Kallist","Kallistus","Kallixtus","Kalman","Kameron","Kamil","Kampion","Kamron","Kane","Kareem","Karel","Kari","Karim","Karl","Karl-Heinz","Karlens","Karlheinz","Karlis","Karlitis","Karol","Karoly","Karson","Karstan","Karsten","Kasey","Kasimir","Kaspar","Kasper","Kastor","Kay","Kayden","Keagan","Keanu","Keaton","Keegan","Keenan","Kegan","Kei","Keith","Kelby","Kellen","Kelly","Kelsey","Kelton","Kelvin","Kemal","Ken","Kendall","Kendrick","Kenelm","Kenley","Kennedy","Kenneth","Kenny","Keno","Kent","Kenton","Kenyon","Keon","Kerman","Keshawn","Kester","Keven","Kevin","Kevon","Keyon","Keyshawn","Khalid","Khalil","Kian","Kieran","Kilby","Kilian","Killian","Kim","Kimberley","Kimon","King","Kingsley","Kinnard","Kinnell","Kinsey","Kipp","Kipper","Kippy","Kirk","Kjell","Klaas","Klaudius","Klaus","Klemens","Klement","Kleopas","Kleophas","Klopas","Knox","Knut","Kobe","Koby","Kody","Kolas","Kolby","Kole","Kolja","Kolton","Konrad","Konradin","Konstantin","Korbin","Korbinian","Korey","Kornel","Kornelius","Kort","Kory","Kosha","Kosta","Kostis","Kostja","Kourosh","Kristian","Kristofer","Kristopher","Kunibert","Kuno","Kunz","Kurt","Kurtis","Kylan","Kyle","Kyler","Kyree","Kyrill","Kyrillus","L'Angley","Ladislaus","Lafayette","Lajos","Lamar","Lamarr","Lambert","Lambrecht","Lamont","Lampert","Lamprecht","Lance","Lancelin","Lancelot","Landan","Landen","Landers","Landis","Lando","Landon","Lane","Lang","Langley","Laramie","Larry","Lars","Larue","Lasalle","Laslo","Lasse","Laszlo","Latimer","Latrell","Launcelot","Laurence","Laurent","Laurentius","Laurenz","Laux","Lawrence","Lawson","Layne","Layton","Lazarus","Leal","Leander","Leandre","Leandro","Lee","Leeroy","Legget","Legolas","Leies","Leif","Leigh","Leland","Lenard","Lennard","Lennart","Leo","Leocadie","Leodegrance","Leon","Leonard","Leonardo","Leonce","Leone","Leonel","Leonhard","Leonid","Leonore","Leopold","Leroi","Leron","Leroux","Leroy","Lester","Leszek","Leva","Leveret","Leverett","Levi","Levin","Lewis","Lex","Liam","Libold","Liborius","Lincoln","Lind","Lindberg","Linden","Lindon","Linn","Lino","Linus","Linwood","Lion","Lionel","Lionell","Lionello","Lisandro","Lisle","Litton","Livio","Llewellyn","Logan","Loisl","London","Lonell","Lonnell","Lonnie","Loreno","Lorenz","Lorenzo","Loring","Loris","Lothair","Lothar","Louie","Louis","Louvel","Lovell","Lowe","Lowell","Loyal","Luc","Luca","Lucas","Lucian","Luciano","Lucien","Ludolf","Ludovic","Ludovico","Ludovicus","Ludwig","Luglio","Luigi","Luis","Luitpold","Luka","Lukas","Luke","Luther","Lutz","Lyle","Lyndon","Lyonel","Lyre","Lysander","Lytton","Mace","Madelon","Madison","Maginhart","Magnus","Mahieu","Maik","Mailhairer","Maitland","Makepeace","Malachi","Malakai","Malcolm","Malik","Malin","Malleville","Mallory","Malou","Malte","Malvin","Malwin","Mandel","Manfred","Mani","Manilo","Manley","Manly","Manneville","Manning","Manolito","Manolo","Mansfield","Mantel","Manton","Manuel","Manville","Many","Marc","Marceau","Marcel","Marcellinus","Marcello","Marcellus","Marcelo","Marco","Marcos","Marcus","Marden","Mardyth","Marek","Marenus","Marian","Mariano","Marin","Marino","Marinus","Mario","Mariolino","Marius","Mark","Markes","Markey","Marko","Markus","Marland","Marley","Marlo","Marlon","Marlow","Marlowe","Marmion","Marq","Marque","Marquez","Marquis","Marquise","Marsden","Marsdon","Marsh","Marshal","Marshall","Marston","Mart","Marten","Marti","Martin","Martino","Maruck","Marvin","Marwin","Marwood","Marzellus","Maslin","Mason","Masselin","Masson","Mateo","Mather","Mathew","Mathias","Mathieu","Mats","Matteo","Mattes","Matthew","Matthias","Matthieu","Mattias","Matty","Matze","Maurice","Mauricio","Mauritius","Maurizio","Maurus","Maverick","Max","Maxence","Maxim","Maxime","Maximilian","Maximillian","Maximo","Maximus","Maxwell","Mayhew","Maynard","Mayne","Maynor","Mead","Medwin","Mees","Mehmet","Meinert","Meinhard","Mekhi","Melchior","Melton","Melville","Melvin","Menachem","Menard","Mercer","Merla","Merle","Merlin","Merlion","Merrell","Merrick","Merrill","Mertin","Merwin","Meus","Micah","Michael","Michail","Micheal","Michel","Michele","Mick","Miguel","Mika","Mike","Mikel","Milan","Miles","Milko","Millard","Miller","Mills","Millson","Milo","Milt","Milten","Milto","Milton","Milty","Mino","Miquel","Mircha","Mirek","Mirko","Misael","Miso","Mitchel","Mitchell","Mohamed","Mohammad","Mohammed","Moises","Momo","Mont-Gomerie","Montague","Montaigu","Montaine","Montgomery","Moor","Moore","More","Morell","Moreno","Morgan","Moritz","Moriz","Morris","Morven","Moses","Moshe","Muck","Muhammad","Mustafa","Mutz","Myles","Nann","Napoleon","Nash","Nasir","Natan","Nathan","Nathanael","Nathanial","Nathaniel","Nathen","Navid","Nayan","Neal","Nealson","Ned","Neddie","Neddy","Nedes","Nehemiah","Neil","Neilson","Neivin","Nelles","Nellie","Nelly","Nelson","Neo","Nepomuk","Nero","Nestor","Neuman","Neumann","Neuveville","Neville","Newall","Newbold","Newell","Newgate","Newland","Newlin","Newman","Newmie","Newton","Nicandro","Nichol","Nicholas","Nick","Nickolas","Nico","Nicodemo","Nicolai","Nicolas","Nicolaus","Niels","Nigel","Nikhil","Nikita","Niklas","Niko","Nikodemus","Nikol","Nikolas","Nikolaus","Nils","Nilson","Nimet","Nino","Noa","Noah","Noe","Noel","Noel  Nolan","Noell","Nolan","Norbert","Noreis","Norice","Norm","Normal","Norman","Normand","Normen","Normie","Norris","North","Norton","Norville","Norvin","Norward","Norwell","Norwin","Norwood","Norwyn","Nouel","Nowles","Numen","Nuran","Nyle","ONille","Oakley","Obert","Octave","Octavio","Odell","Oden","Odin","Odo","Odolf","Odysseus","Ogden","Olaf","Ole","Oleg","Oli","Olin","Oliver","Olivier","Omar","Omari","Omarion","Onfroi","Onnan","Onno","Onnond","Oralndo","Orazio","Orion","Orlan","Orlando","Orman","Ormen","Ornand","Orson","Orvelle","Orvil","Orville","Osbaldo","Osbert","Osborn","Osborne","Oscar","Osgood","Oskar","Osmar","Osmond","Ossie","Osvaldo","Oswald","Oswaldo","Oswall","Oswell","Oswin","Otger","Othello","Othmar","Otmar","Otmund","Otto","Otwin","Ourson","Ove","Owe","Owen","Oxford","Oxon","Oxton","Ozzie","Paavo","Pablo","Pacey","Packard","Paco","Padgett","Page","Paget","Paien","Paige","Palmer","Palmiro","Pancratius","Pankratz","Paolo","Parfait","Paris","Park","Parke","Parker","Parkley","Parks","Parr","Parry","Pascal","Pascual","Pasquale","Pat","Paton","Patric","Patrick","Patten","Pattin","Patton","Paul","Paule","Paulus","Pawel","Paxon","Paxton","Payton","Pearson","Pedro","Peer","Pelham","Pell","Pelton","Penley","Penn","Penrod","Pepi","Pepin","Pepino","Pepperell","Peppi","Peppin","Per","Perceval","Percival","Percy","Perren","Perrin","Perry","Perryn","Peter","Petrus","Peverell","Peyton","Pharamond","Phil","Philip","Philipp","Philippe","Phillip","Phillipe","Phoenix","Pierce","Piero","Pierpont","Pierre","Pierrepont","Piers","Pierson","Pietro","Pio","Piperel","Pippin","Piret","Pirmin","Pit","Pius","Plat","Platt","Pollard","Pomeroy","Pommelraie","Porter","Porteur","Portier","Pranav","Preruet","Prescott","Presley","Preston","Prewitt","Priest","Priestley","Priestly","Prince","Priour","Prisko","Pruet","Pruie","Pruitt","Pryor","Putnam","Putney","Quennel","Quent","Quentin","Quenton","Quentrell","Quincey","Quincy","Quinn","Quint","Quinten","Quintin","Quintinus","Quinton","Quintrell","Quintus","Quinzi","Quirin","Quirinus","Régis","Rab","Rabbit","Rad","Radbert","Radcliff","Radcliffe","Radclyf","Radclyffe","Radford","Radley","Radnor","Radomil","Rae","Rafael","Raff","Raffael","Raffaello","Raffi","Raghnall","Rahul","Rai","Raik","Raimond","Raimondo","Raimund","Raimundo","Rainald","Rainer","Rainger","Rainier","Raleigh","Ralf","Ralph","Ralston","Rambert","Ramiro","Ramon","Ramond","Ramsay","Ramses","Ramsey","Ramzey","Ramzi","Randall","Randy","Ranger","Ranier","Ransden","Ransford","Ransley","Ransom","Raoul","Raphael","Rashad","Rasiel","Raul","Raven","Ravi","Ravinger","Ravinia","Rawdon","Rawley","Rawlings","Rawlins","Rawls","Rawly","Rawson","Ray","Rayburn","Rayce","Rayder","Raydon","Rayfield","Rayford","Raylen","Raymon","Raymond","Raymund","Raymundo","Raynard","Raynell","Read","Reade","Reading","Reagan","Reamonn","Red","Redd","Redding","Redfield","Redford","Redgrave","Redman","Redwald","Reece","Reed","Reese","Reg","Reggie","Reggy","Reginald","Regnauld","Reid","Reilly","Reimar","Reimund","Reinald","Reiner","Reinhard","Reinhold","Reinold","Reinwald","Rell","Remi","Remington","Remme","Remmie","Remmy","Remo","Remy","René","Renald","Renard","Renato","Renault","Rene","Renne","Rennie","Renny","Reto","Reuben","Reule","Reve","Rex","Rey","Reymond","Reymundo","Reynaldo","Reynard","Reynold","Reynolds","Rhett","Ricard","Ricardo","Rich","Richard","Richardo","Richmond","Rick","Rickard","Rickey","Rickie","Ricky","Rico","Rider","Ridley","Rigby","Rigoberto","Riley","Rinaldo","Riobard","Rip","Ripley","Rique","Rishley","Risto","Riston","River","Rob","Robb","Robben","Robbie","Robbins","Robby","Rober","Robert","Roberto","Robey","Robin","Robinson","Rocco","Roch","Roche","Rochester","Rocke","Rocky","Rod","Rodd","Roddie","Roddric","Roddrick","Roddy","Rodel","Rodell","Roderic","Roderich","Roderick","Rodge","Rodger","Rodhlann","Rodi","Rodman","Rodmond","Rodmund","Rodney","Rodolf","Rodolfo","Rodolph","Rodrigo","Roel","Rogelio","Roger","Rogj","Rohan","Roi","Rol","Roland","Rolando","Rolf","Rolfe","Rollan","Rolland","Rollie","Rollin","Rollo","Rolof","Rolph","Rolt","Romain","Roman","Romano","Romek","Romeo","Ron","Ronald","Ronaldo","Ronan","Ronnie","Ronny","Rory","Roselin","Ross","Roswald","Roswall","Roswell","Roth","Rousse","Roussel","Rousset","Rousskin","Rouven","Rowan","Rowe","Rowland","Roy","Royal","Royce","Royden","Ruben","Rubert","Ruddy","Rudi","Rudiger","Rudolf","Rudolfo","Rudolph","Rudy","Rudyard","Ruelle","Ruff","Ruffe","Ruggero","Rui","Rule","Rupert","Ruppert","Ruprecht","Rush","Rushe","Rushkin","Ruskin","Russ","Russel","Russell","Rust","Rutherford","Ruthren","Ruven","Ryan","Rycroft","Ryder","Rylan","Ryland","Ryle","Rylee","Ryley","Ryman","Rypley","Ryton","Sönke","Sören","Sabastian","Saber","Sacharja","Sadddique","Sage","Saladin","Saladino","Salentin","Salim","Salomo","Salomon","Salomone","Salvador","Salvator","Salvatore","Sam","Sami","Samir","Sammy","Samson","Samuel","Samy","Sanborn","Sandford","Sandon","Sandro","Sandy","Sanford","Santiago","Santino","Santos","Sargent","Sascha","Satordi","Saul","Sauville","Saverio","Saville","Savion","Sawyer","Schorsch","Scipio","Scipione","Scot","Scott","Scottie","Scotty","Seabert","Seabright","Seabrook","Seabury","Seamus","Sean","Searl","Searlas","Searle","Searlus","Sebastian","Sebastiano","Sebastien","Seberg","Sebert","Seid","Seignour","Selby","Selim","Semaj","Semjon","Senad","Senet","Senior","Sennet","Sepp","Seppel","Sepperl","Seppi","Sergej","Sergio","Sergius","Sesto","Seth","Severin","Severinus","Severn","Severus","Sevim","Sevrin","Seward","Sewell","Seymour","Shamar","Shane","Shannon","Shaun","Shaw","Shawn","Shayne","Shea","Sheldon","Shell","Shelley","Shelli","Shelly","Shemar","Shep","Shepard","Shepherd","Shepley","Sheppard","Sherborne","Sherlock","Sherm","Sherman","Sherwin","Sherwood","Shipley","Sid","Siddel","Sidney","Sidwell","Siegfrid","Siegfried","Siegmund","Sigfrid","Sigfried","Siggi","Sigismond","Sigismund","Sigmond","Sigmund","Sigwald","Silas","Silvain","Silvester","Silvestre","Silvio","Silvius","Simeon","Simon","Sinan","Sincere","Sinclair","Sinclaire","Sinjin","Sisto","Siward","Sixt","Sixtus","Skrolan","Skylar","Skyler","Slade","Snowden","Snowdun","Sobek","Solomon","Somer","Somerled","Somerville","Sonke","Sonny","Sorel","Soren","Sorrell","Spangler","Speck","Spence","Spencer","Spenser","Spike","Spiros","Sprague","Spyridon","Spyros","Stanberry","Stanbury","Stanek","Stanfield","Stanford","Stanhope","Stanislaus","Stanleigh","Stanley","Stanly","Stanmore","Stanton","Stanway","Stanwick","Stanwyck","Stefan","Steffen","Stein","Stephan","Stephen","Stephon","Sterling","Steve","Steven","Stockman","Stockton","Stockwell","Stokley","Stone","Stroud","Stuart","Studs","Suleiman","Sullivan","Sumarville","Sumner","Sven","Swen","Syd","Sydell","Sydney","Syed","Sylwester","Taavi","Tabaluga","Taillefer","Talbot","Talehot","Talon","Tancred","Tanner","Tarek","Tarik","Tariq","Tarzan","Tassilo","Tasso","Tate","Tavin","Tavion","Taylor","Tayrese","Tearlach","Ted","Teddic","Teddie","Tedman","Tedmund","Tedric","Telfer","Telfor","Telford","Telfour","Terenz","Terrance","Terrel","Terrell","Terrence","Terrill","Terris","Terry","Thabo","Thaddäus","Thaddeus","Thaisen","Thane","Thassilo","Thatcher","Thees","Theo","Theobald","Theodor","Theodore","Theodoric","Theodorick","Theron","Therron","Thibaud","Thibaut","Thieny","Thierry","Thiery","Thomas","Thor","Thorald","Thoralf","Thorben","Thorbert","Thorburn","Thorley","Thormond","Thorn","Thorndyke","Thorne","Thornley","Thornton","Thorpe","Thorsten","Thurber","Thure","Thurlow","Thurman","Thurmon","Thurmond","Tibault","Tibbald","Tiberio","Tiberius","Tibor","Till","Tillmann","Tilmann","Tilo","Tim","Timo","Timon","Timothy","Tino","Tioboid","Tiran","Tirell","Tito","Titus","Tizian","Tiziano","Tjorven","Tobi","Tobia","Tobias","Toby","Todd","Toffel","Tom","Tomas","Tomaso","Tombke","Tomke","Tomkin","Tomlin","Tommy","Tompkin","Toni","Tonio","Tony","Torben","Torge","Torold","Torsten","Tostig","Toussnint","Towne","Townes","Townley","Townsend","Trace","Tracy","Tranter","Traugott","Travers","Travis","Travon","Tre","Trent","Trenton","Trever","Treves","Trevin","Trevion","Trevon","Trevor","Trey","Treyton","Tripp","Tristan","Tristen","Tristian","Tristin","Triston","Troy","Troyes","True","Trueman","Truesdale","Truman","Trystan","Tucker","Turner","Ty","Tybalt","Tyce","Tycho","Tychon","Tye","Tyeis","Tyeson","Tyler","Tylor","Tyne","Tyree","Tyrell","Tyrese","Tyron","Tyrone","Tyshawn","Tyson","Udo","Ugo","Ugolino","Uhland","Uland","Ulf","Uli","Ulises","Ulixes","Ulli","Ulric","Ulrich","Ulrico","Ulysses","Umberto","Urban","Urbano","Urbanus","Urias","Uriel","Urija","Urs","Ursinus","Ursio","Ursus","Uto","Utto","Uve","Uvo","Uwe","Uwo","Vachel","Vail","Valdemar","Valdimar","Valdimiro","Valdis","Valentianus","Valentin","Valentiniano","Valentino","Valentinus","Valentius","Valerian","Valerianus","Valerio","Valerius","Valiant","Vallis","Vallois","Vance","Vardan","Varden","Vardon","Vasco","Vaughn","Vayle","Veit","Verddun","Verdell","Verel","Vern","Vernay","Verne","Vernell","Verner","Verney","Vernon","Verrall","Verrell","Verrill","Veryl","Vic","Vicente","Vick","Vico","Vicq","Victor","Victorian","Victorianus","Victorinus","Vidal","Videl","Vike","Viktor","Viktorin","Vilmos","Vincent","Vincentius","Vincenz","Vincenzo","Vinzenez","Vinzent","Vinzenz","Virgil","Vital","Vitale","Vitalis","Vito","Vittorio","Vladimir","Volkan","Volker","Volkher","Volkmar","Volkmer","Vollert","Volmar","Volney","Von","Wade","Waggoner","Wagner","Wain","Waine","Wake","Wakefield","Wakeley","Wakeman","Walcot","Walcott","Waldemar","Waldo","Waldomar","Waldron","Walker","Wallace","Wallach","Wallas","Waller","Wallie","Wallis","Wally","Walmond","Walmund","Walsh","Walt","Walter","Walters","Walther","Walton","Wanja","Wanko","Ward","Wardell","Warden","Wardley","Warfield","Warford","Waring","Warley","Warmond","Warmund","Warner","Warnke","Warrane","Warren","Warrick","Warton","Warwick","Washington","Wassilie","Wat","Watkins","Watson","Watt","Waverly","Way","Wayland","Waylon","Wayne","Webb","Weber","Webley","Webster","Weimer","Welborne","Welby","Welch","Weldon","Welf","Welford","Weller","Welles","Wells","Welsh","Welton","Wenceslas","Wendel","Wendelin","Wendell","Wenzel","Werner","Wernher","Werther","Wes","Wesley","Wess","Wessely","West","Westbrook","Westby","Westcott","Westleigh","Weston","Wetherby","Wheaton","Wheeler","Whit","Whitby","Whitcomb","Whitelaw","Whitfield","Whitford","Whitley","Whitlock","Whitman","Whitmore","Whittaker","Wiatt","Wiclef","Wiclif","Wilbur","Wiley","Wilfer","Wilfert","Wilfred","Wilfrid","Wilfried","Wilhelm","Will","Willem","Willi","William","Willie","Willow","Willy","Wilmer","Wilmot","Wilson","Wim","Winchell","Windemuth","Windham","Windsor","Winemar","Winfield","Winfred","Winfrey","Winfrid","Winfried","Wingate","Winimar","Winmar","Winslow","Winsor","Winston","Winthrop","Winton","Winward","Wirt","Wirth","Witas","Witt","Witter","Witton","Wladimir","Wladisla","Woitech","Wolf","Wolfe","Wolfgang","Wolfram","Wolter","Woodie","Woodrow","Woodruff","Woodward","Woody","Wright","Wulf","Wum","Wyatt","Wylie","Wyn","Wyndam","Wynton","Xander","Xaver","Xaverius","Xavier","Xzavier","Yadiel","Yahir","Yamil","Yan","Yannic","Yannick","Yannis","Yasin","Yehudi","Yorik","York","Yosef","Yul","Yule","Yven","Yves","Ywan","Zachariah","Zacharias","Zachary","Zachery","Zack","Zackary","Zackery","Zadoc","Zain","Zaire","Zakary","Zander","Zane","Zavier","Zayne","Zechariah","Zenobio","Zero","Zeus","Zino","Zion","Zyrus"};
		int rnd = (int) Math.floor(Math.random() * namesMale.length);
		String names= namesMale[rnd];
		
			return names;
		}

		protected static String LNames() {
			// TODO Auto-generated method stub

	String[] names1 = {"Ander","Arm","Arn","Bal","Batten","Beau","Beres","Black","Blan","Boat","Bott","Bran","Brew","Bridge","Brow","Buck","Cal","Camp","Car","Caul","Chal","Chap","Clay","Cole","Con","Cope","Coul","Coving","Craw","Cunning","Daven","Daw","Dris","Du","Ed","Eger","Est","Fair","Farn","Fiel","Fore","Fox","Frank","Free","Fuller","Gallo","Gardi","Garret","Glad","Gold","Good","Gran","Greg","Gren","Ham","Hamil","Har","Harring","Hart","Hen","Hol","Hop","How","Hub","Hum","Hutch","Jen","Ken","Knap","Lam","Lamb","Lan","Law","Le","Lind","Living","Mac","Man","Marsh","Mau","Max","May","Mea","Mer","Mon","Mont","Mor","More","Moris","Mul","Mur","Nel","Nichol","Nick","Nor","O","Os","Pad","Paken","Pal","Par","Part","Patter","Pau","Pear","Penning","Pet","Peter","Pett","Pick","Pit","Pitt","Port","Put","Rain","Ram","Ran","Rem","Rober","Robin","Rosen","Rot","Roths","Rott","Rut","Ruther","Rux","San","Saun","Saw","Sey","Shan","Shear","Shep","Shur","Sin","Skel","Skin","Small","Solo","Spen","Stan","Ste","Stone","Strat","Sul","Swee","Tal","Tay","Tho","Thorn","Tom","Town","Under","Valen","Wai","Wal","War","Wat","Wea","Web","Wer","Whit","Wil","Win","Woo","Wood","Wyn","Yeat"};
	String[] names2 = {"bard","barry","barth","bell","bert","borne","bot","bow","brand","brandt","brick","brook","burg","burn","card","caster","cher","child","clair","coll","comb","cox","cus","dal","dall","daway","del","dell","der","ders","ding","don","dows","drey","dwell","dwin","fax","field","ford","fort","gan","ger","gett","gomery","gor","hall","ham","herd","hold","hope","ker","kett","kins","lace","land","ledge","leigh","ler","less","lins","lor","lyn","maker","man","mann","mar","mas","mer","mers","mert","mier","mon","mond","mont","mour","nard","nedy","nell","nelly","ner","ney","ning","nings","non","nor","pard","perd","phens","phrey","port","rance","rant","rence","rene","rett","rice","ridge","rish","rough","row","ryett","say","sen","send","sey","sley","smith","son","ster","ston","stone","strong","sworth","ter","tero","ters","thall","tine","ton","van","ver","ville","vine","ward","wards","way","well","wen","wens","win","wood","yer"};

	String[] names3 = {"b","c","d","f","g","h","j","k","l","m","n","p","r","s","t","v","w","z","br","dr","fr","gr","pr","tr","st","fl","gl","bl","pl","ph","sh","sl","","","","","","","","","",""};
	String[] names4 = {"a","e","i","o","u","ai","oo","ee","ea","ou","ai"};
	String[] names5 = {"bb","cc","dd","gg","kk","ll","mm","nn","rr","ss","pp","bs","ck","ckl","dg","dk","dl","ds","dw","gl","lb","lbr","ld","ldw","lf","lm","lst","lt","lw","mb","mps","nc","nch","nd","ndr","ns","nsl","nt","nth","ntl","rb","rdn","rg","rk","rl","rn","rns","rp","rt","rv","sh","st","stm","tch","tl","tm","vs","wd","wf","wl","wn","wst","yd","yt"};
	String[] names6 = {"ch","gg","ggs","gs","k","l","ld","ll","m","mb","n","ng","ngs","ns","p","ph","r","rd","rn","rs","s","sh","ss","t","tt","w","wl","ws","y","","","","","","","","","","","","","",""};

	String[] names7 = {"Amber","Apple","Arm","August","Autumn","Bar","Bell","Black","Boat","Bow","Brew","Bride","Bridge","Bronze","Brown","Buck","Camp","Can","Chamber","Chap","Clay","Cliff","Cob","Cole","Coll","Copper","Cotton","Coving","Craw","Crow","Cunning","Dark","Daven","Daw","Down","Dye","Eagle","East","Feather","Fish","Fletch","Fore","Fox","Free","Fuller","Gallo","Gard","Gentle","Gil","Gill","God","Gold","Good","Grand","Green","Grim","Gross","Hart","Hawk","Hollo","Hunting","Kil","Knight","Law","Living","Loch","Lock","Love","Marsh","Merry","Mill","Moon","More","Moss","New","Night","North","Rain","Raven","Rich","Robin","Roth","Rott","Sea","Silver","Small","Solo","South","Spring","Stone","Summer","Sweet","Timber","Town","Under","Web","West","Whit","Winter","Wood"};
	String[] names8 = {"bard","beard","borne","bow","breed","bride","burn","colt","comb","dall","end","field","ford","gard","guard","hall","ham","head","hill","kind","land","ledge","less","ling","low","maker","man","mann","mere","mond","more","mour","port","rich","riddle","ridge","send","smith","son","star","stein","ster","strong","tomb","ton","tree","ward","water","way","well","win","wood"};


		
		int rnd;
		int rnd2;
		int rnd3;
		int rnd4;
		int rnd5;
		int i=(int) Math.random();
		String names;
		
			if(i < 3){
				 rnd = (int) Math.floor(Math.random() * names1.length);
				 rnd2 = (int) Math.floor(Math.random() * names2.length);
				 names = names1[rnd] + names2[rnd2];
			}else if(i < 6){
				rnd = (int) Math.floor(Math.random() * names7.length);
				rnd2 = (int) Math.floor(Math.random() * names8.length);
				names = names7[rnd] + names8[rnd2];
			}else{
				rnd = (int) Math.floor(Math.random() * names3.length);
				rnd2 = (int) Math.floor(Math.random() * names4.length);
				rnd3 = (int)Math.floor(Math.random() * names5.length);
				rnd4 = (int) Math.floor(Math.random() * names4.length);
				if(rnd2 > 4){
					while(rnd4 > 4){
						rnd4 = (int)Math.floor(Math.random() * names4.length);
					}
				}
				rnd5 = (int) Math.floor(Math.random() * names6.length);
				names = names3[rnd] + names4[rnd2] + names5[rnd3] + names4[rnd4] + names6[rnd5];
			}
			return names;
			
	}
		protected static String Appearance() {
	        	String A = null;//Appearance 
	        	int a= rnd.nextInt(20);
	        	if(a==0) {
	        		A="Distinctive jewelry: earrings, necklace, circlet, bracelets";
	        	}
	        	if(a==1) {
	        		A="Piercings";
	        	}
	        	if(a==2) {
	        		A="Flamboyant or outlandish clothes";
	        	}
	        	if(a==3) {
	        		A="Formal, clean clothes";
	        	}
	        	if(a==4) {
	        		A="Ragged, dirty clothes";
	        	}
	        	if(a==5) {
	        		A="Pronounced scar";
	        	}
	        	if(a==6) {
	        		A="Missing teeth";
	        	}
	        	if(a==7) {
	        		A="Missing fingers";
	        	}
	        	if(a==8) {
	        		A="Unusual eye color (or two different colors)";
	        	}
	        	if(a==9) {
	        		A="Tattoos";
	        	}
	        	if(a==10) {
	        		A="Birthmark";
	        	}
	        	if(a==11) {
	        		A="Unusual skin color";
	        	}
	        	if(a==12) {
	        		A="Bald";
	        	}
	        	if(a==13) {
	        		A="Braided beard or hair";
	        	}
	        	if(a==14) {
	        		A="Unusual hair color";
	        	}
	        	if(a==15) {
	        		A="Nervous eye twitch";
	        	}
	        	if(a==16) {
	        		A="Distinctive nose";
	        	}
	        	if(a==17) {
	        		A="Distinctive posture (crooked or rigid)";
	        	}
	        	if(a==18) {
	        		A="Exceptionally beautiful";
	        	}
	        	if(a==19) {
	        		A="Exceptionally ugly";
	        	}
	        	return A;
		
	}
		protected static String Temperament() {
			String T = null;//Temperament
        	int t=rnd.nextInt(12);
        	if(t==0) {
        		T="Argumentative";
        	}
        	if(t==1) {
        		T="Arrogant";
        	}
        	if(t==2) {
        		T="Blustering";
        	}
        	if(t==3) {
        		T="Rude";
        	}
        	if(t==4) {
        		T="Curious";
        	}
        	if(t==5) {
        		T="Friendly";
        	}
        	if(t==6) {
        		T="Honest";
        	}
        	if(t==7) {
        		T="Hot tempered";
        	}
        	if(t==8) {
        		T="Irritable";
        	}
        	if(t==9) {
        		T="Ponderous";
        	}
        	if(t==10) {
        		T="Quiet";
        	}
        	if(t==11) {
        		T="Suspicious";
        	}
        	return T;
		}
		protected static String Mannerism() {
			String M = null;//Mannerism
        	int m=rnd.nextInt(20);
        	if(m==0) {
        		M="Prone to singing, whistling, or humming quietly";
        	}
        	if(m==1) {
        		M="Speaks in rhyme or some other peculiar way";
        	}
        	if(m==2) {
        		M="Particularly low or high voice";
        	}
        	if(m==3) {
        		M="Slurs words, lisps, or stutters";
        	}
        	if(m==4) {
        		M="Enunciates overly clearly";
        	}
        	if(m==5) {
        		M="Speaks loudly";
        	}
        	if(m==6) {
        		M="Whispers";
        	}
        	if(m==7) {
        		M="Uses flowery speech or long words";
        	}
        	if(m==8) {
        		M="Frequently uses the wrong word";
        	}
        	if(m==9) {
        		M="Uses colorful oaths and exclamations";
        	}
        	if(m==10) {
        		M="Makes constant jokes or puns";
        	}
        	if(m==11) {
        		M="Prone to predictions of doom";
        	}
        	if(m==12) {
        		M="Fidgets";
        	}
        	if(m==13) {
        		M="Squints";
        	}
        	if(m==14) {
        		M="Stares into the distance";
        	}
        	if(m==15) {
        		M="Chews something";
        	}
        	if(m==16) {
        		M="Paces";
        	}
        	if(m==17) {
        		M="Taps fingers";
        	}
        	if(m==18) {
        		M="Bites fingernails";
        	}
        	if(m==19) {
        		M="Twirls hair or tugs beard";
        	}
        	return M;
		}
		protected static String Occupation() {
        	String O = null;//Occupation
        	String[] nm1 = {"Academic","Accountant","Acolyte","Acrobat","Actor","Administrator","Adventurer","Advisor","Alchemist","Almoner","Animal Breeder","Animal Handler","Anthropologist","Apothecary","Archaeologist","Archer","Architect","Archivist","Armorer","Arms Merchant","Artisan","Artist","Ascetic","Assassin","Astrologist","Astronomist","Baker","Bandit","Banker","Barber","Bard","Barkeep","Barmaid","Barrister","Beastmaster","Beekeeper","Beggar","Biologist","Blacksmith","Board Member","Boatman","Bodyguard","Bookbinder","Botanist","Bottler","Bounty Hunter","Brewer","Brick Maker","Bricklayer","Bridge Builder","Brigand","Buccaneer","Buckle Maker","Builder","Bureaucrat","Burglar","Butcher","Butler","Cannoneer","Caravan Leader","Carder","Carpenter","Carter","Cartographer","Cartwright","Chamberlain","Chandler","Charioteer","Cheesemaker","Chef","Chemist","Chirurgeon","Clergy","Cleric","Clerk","Clock Maker","Clothes Washer","Clothier","Clown","Coachman","Coinsmith","Commander","Con Artist","Conjurer","Cook","Cooper","Counselor","Courtesan","Courtier","Cowherd","Craftsman","Crossbowman","Crusader","Cutler","Cutpurse","Dairymaid","Dancer","Demonologist","Dentist","Detective","Diplomat","Distiller","Diver","Doctor","Drayman","Driver","Druid","Duchess","Duelist","Duke","Dyer","Economist","Enchanter","Engineer","Engraver","Executioner","Explorer","Falconer","Farmer","Farrier","Ferryman","Firemaker","Fisherman","Fishmonger","Fletcher","Forester","Fortune Teller","Friar","Furrier","Gambler","Gardener","Gatekeeper","Gemsmith","Geologist","Geomancer","Gladiator","Glassblower","Glazier","Glovemaker","Goldsmith","Gravedigger","Groom","Guard","Guildmaster","Hacker","Handmaiden","Hatter","Hayward","Healer","Herald","Herbalist","Herder","Herdsman","Highwayman","Historian","Horse Breeder","Horse Trainer","Hounds Master","Hunter","Illuminator","Innkeeper","Inscriptionist","Instructor","Interpreter","Inventor","Investor","Jailer","Jester","Jewelcrafter","Jeweler","Judge","Juggler","King","Knight","Lady","Lady in Waiting","Lantern Maker","Lawyer","Leatherworker","Librarian","Lighthouse Keeper","Limner","Linguist","Loanshark","Locksmith","Longbowman","Lord","Loremaster","Lumberjack","Machinist","Magician","Maid","Maidservant","Man at Arms","Marine","Marksman","Mason","Mayor","Mechanic","Mercenary","Merchant","Messenger","Meteorologist","Midwife","Milkmaid","Miller","Milliner","Mine Owner","Miner","Minion","Minister","Minstrel","Mirror Maker","Moneylender","Monk","Monster slayer","Mortician","Mourner","Mugger","Mule Driver","Musician","Necromancer","Nun","Nurse","Officer","Page","Painter","Paladin","Paper Maker","Paratrooper","Pastor","Pastry Cook","Pawnbroker","Peasant","Peddler","Perfumer","Pharmacist","Philosopher","Philospher","Photographer","Physician","Pickpocket","Pigkeeper","Pilgrim","Pilot","Pirate","Pit Fighter","Poet","Politician","Postman","Potter","Preacher","Priest","Prince","Princess","Procurer","Professor","Programmer","Prophet","Pursemaker","Pyromancer","Pyrotechnician","Quartermaster","Queen","Raider","Ranger","Rat-Catcher","Ratcatcher","Riflesmith","Rogue","Roofer","Rope Maker","Ropemaker","Royal Advisor","Rugmaker","Runecrafter","Saddler","Sage","Sailor","Salter","Sapper","Scavenger","Scholar","Scout","Scribe","Scrivener","Sculptor","Seamaster","Seamstress","Secretary","Seer","Servant","Shaman","Shepherd","Sheriff","Ship Builder","Ship's Captain","Ship's Mate","Shipwright","Shoemaker","Shrubber","Silversmith","Singer","Skinner","Slave","Slave Master","Slave Trader","Slaver","Smith","Smuggler","Soldier","Songwriter","Sorcerer","Special Forces","Spice Merchant","Spiritual Healer","Sportsman","Spy","Squire","Stable Hand","Stablehand","Stabler","Stevedore","Steward","Storyteller","Student","Summoner","Surgeon","Surveyor","Sword Smith","Swordsman","Synthesist","Tailor","Tanner","Tavernkeep","Tax Collector","Teacher","Technician","Templar","Terraformer","Thatcher","Thief","Timelord","Tinker","Toll Keeper","Torturer","Town Counselor","Town Crier","Tracker","Trader","Trainer","Trapper","Treasure Hunter","Vendor","Village Idiot","Warlock","Warrior","Watchman","Water Carrier","Weaver","Wetnurse","Wheelwright","Wine Merchant","Witch","Wizard","Wood Merchant","Woodcarver","Woodcutter","Zookeeper","Zoologist"};
        	int o = (int) Math.floor(Math.random() * nm1.length);
    		O= nm1[o];
    		return O;
		}
		protected static String Race() {
        	String R = null;//Race
        	int r = rnd.nextInt(100);
        	if(r<60) {
        		R="Human";	
        	}
        	if(r>=60 &&r<65) {
        		R="Dwarf";
        	}
        	if(r>=65 &&r<70) {
        		R="Elf";
        	}
        	if(r>=70 &&r<75) {
        		R="Halfling";
        	}
        	if(r>=75 &&r<77) {
        		R="Dragonborn";
        	}
        	if(r>=77 &&r<80) {
        		R="Tiefling";
        	}
        	if(r>=80 &&r<85) {
        		R="Gnome";
        	}
        	if(r>=85 &&r<90) {
        		R="Half-Orc";
        	}
        	if(r>=90) {
        		R="Half-Elf";
        	}
        	return R;
		}	
		protected static String Gender() {
			int g=rnd.nextInt(2);
			String G = null;//Gender
        	if(g==0) {
        		G="Male";
        	}
        	if(g==1) {
        		G="Female";
        	}
        	return G;
		}
		protected static String FName(String R,String G) {
        	String FN = null;//First Name
        	if(G.equals("Male")) {
        		if(R.equals("Human")) {
        			FN=HumanMFNames();
        		}
        		if(R.equals("Dwarf")) {
	        		FN=DwarfMFNames();
	        		}
        		if(R.equals("Elf")) {
	        		FN=ElfMFNames();
	        		}
        		if(R.equals("Halfling")) {
	        		FN=HalflingMFNames();
	        		}
        		if(R.equals("Dragonborn")) {
	        		FN=DragonbornMFNames();
	        		}
        		if(R.equals("Tiefling")) {
	        		FN=TieflingMFNames();
	        		}
        		if(R.equals("Gnome")) {
	        		FN=GnomeMFNames();
	        		}
        		if(R.equals("Half-Orc")) {
	        		FN=HalforcMFNames();
	        		}
        		if(R.equals("Half-Elf")) {
	        		FN=HalfelfMFNames();
	        		}
        	}
        	if(G.equals("Female")) {
        		if(R.equals("Human")) {
        			FN=HumanFFNames();
        		}
        		if(R.equals("Dwarf")) {
	        		FN=DwarfFFNames();
	        		}
        		if(R.equals("Elf")) {
	        		FN=ElfFFNames();
	        		}
        		if(R.equals("Halfling")) {
	        		FN=HalflingFFNames();
	        		}
        		if(R.equals("Dragonborn")) {
	        		FN=DragonbornFFNames();
	        		}
        		if(R.equals("Tiefling")) {
	        		FN=TieflingFFNames();
	        		}
        		if(R.equals("Gnome")) {
	        		FN=GnomeFFNames();
	        		}
        		if(R.equals("Half-Orc")) {
	        		FN=HalforcFFNames();
	        		}
        		if(R.equals("Half-Elf")) {
	        		FN=HalfelfFFNames();
	        		}
        	}
        	return FN;
		}
}


