package com.quetionbank;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class TestMain {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Question qst=new Question();
			qst.setQus("Tera Kaam Kitna???");
			
			Answer ans=new Answer();
			ans.setAns("Jaa ke Baap ko bol");
			Configuration con=new Configuration();
			con.configure();
			SessionFactory sft= con.buildSessionFactory();
			Session sss=sft.openSession();
			Transaction trr= sss.beginTransaction();
			sss.save(qst);
			sss.save(ans);
			trr.commit();
			sss.close();
		}

	}


