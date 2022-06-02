package uz.bepro.cbu.model;

import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("CcyNm_EN")
	private String ccyNmEN;

	@SerializedName("CcyNm_UZC")
	private String ccyNmUZC;

	@SerializedName("Diff")
	private String diff;

	@SerializedName("Rate")
	private String rate;

	@SerializedName("Ccy")
	private String ccy;

	@SerializedName("CcyNm_RU")
	private String ccyNmRU;

	@SerializedName("id")
	private int id;

	@SerializedName("CcyNm_UZ")
	private String ccyNmUZ;

	@SerializedName("Code")
	private String code;

	@SerializedName("Nominal")
	private String nominal;

	@SerializedName("Date")
	private String date;

	public String getCcyNmEN(){
		return ccyNmEN;
	}

	public String getCcyNmUZC(){
		return ccyNmUZC;
	}

	public String getDiff(){
		return diff;
	}

	public String getRate(){
		return rate;
	}

	public String getCcy(){
		return ccy;
	}

	public String getCcyNmRU(){
		return ccyNmRU;
	}

	public int getId(){
		return id;
	}

	public String getCcyNmUZ(){
		return ccyNmUZ;
	}

	public String getCode(){
		return code;
	}

	public String getNominal(){
		return nominal;
	}

	public String getDate(){
		return date;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"ccyNm_EN = '" + ccyNmEN + '\'' + 
			",ccyNm_UZC = '" + ccyNmUZC + '\'' + 
			",diff = '" + diff + '\'' + 
			",rate = '" + rate + '\'' + 
			",ccy = '" + ccy + '\'' + 
			",ccyNm_RU = '" + ccyNmRU + '\'' + 
			",id = '" + id + '\'' + 
			",ccyNm_UZ = '" + ccyNmUZ + '\'' + 
			",code = '" + code + '\'' + 
			",nominal = '" + nominal + '\'' + 
			",date = '" + date + '\'' + 
			"}";
		}
}