/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package smsstarter;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SmsStarter {

    	public static void main(String[] args) {
                //Student stu[]=new Student[2];
		//StudentManagementSystem sms=new StudentManagementSystem();
                //SimpleStudentRepository ssr=new SimpleStudentRepository();
                //stu[0]=new Student("John","Doe",12345,"Jaffna");
                //sms.registerStudent(stu[0]);
                //sms.listAllStudents();
                //stu[1]=new Student("Diana","Krishna",34567,"Colombo");
                //for (int i = 0; i < 2; i++) {
                   // sms.registerStudent(stu[i]);
           // }            
                //sms.listAllStudents();
                
                ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("springXML.xml");
                context.start();
                SimpleStudentRepository ssr=(SimpleStudentRepository)context.getBean("ssrep");
                ClassPathXmlApplicationContext context1=new ClassPathXmlApplicationContext("springXML.xml");
                context1.start();               
                Student stud=(Student)context.getBean("student");
                ssr.saveStudent(stud);
                
		//load the bean from spring
//		sms.listAllStudents();
//		sms.registerStudent(stu);
//		sms.listAllStudents();
	}
}

