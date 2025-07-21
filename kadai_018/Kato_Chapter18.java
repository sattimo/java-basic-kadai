package kadai_018;

 abstract public class Kato_Chapter18 {
	
	//苗字フィールド
	public String familyName = "加藤";
	//名前フィールド
	public String givenName ;
	//住所フィールド
	public String address ="東京都中野区〇×";
	
	abstract public void setGivenName();
	

	
	 public  void commonIntroduce() {
		 System.out.println("名前は" + familyName + givenName + "です"   );
		 System.out.println("住所は" + address + "です");
	 }
		 
	 abstract public void eachIntroduce() ;
		
		 
		 public void execIntroduce() {
			 commonIntroduce();
			 eachIntroduce();
	 }
	 
	 }
