package edu.monmouth.nslookup;

import java.net.UnknownHostException;
import java.net.InetAddress;
public class Nslookup {

    public static void main(String[] args){
		final int REQUIREDPARAMETERS=5;
	
		byte[] address = { 127,0,0,1 };  // use for question 3
		byte[] anotherAddress = { 8,8,8,8 };  // use for question 3
		byte[] anotherAddress1 = { 75,75,75,75 };  // use for question 3
	    
		try 
		{
			InetAddress localhost = InetAddress.getLocalHost();
			String fullyQualifiedDomainName = InetAddress.getLocalHost().getCanonicalHostName(); 
			
			System.out.println("1.My host");
		    System.out.println("\nSystem IP Address : " +(localhost.getHostAddress()).trim());
		    System.out.println("System host name : " +localhost.getHostName());
		    System.out.println("Fully qualified domain name of my host computer is : "+fullyQualifiedDomainName);
		
		if (args.length != REQUIREDPARAMETERS) {
		    System.err.println("Supply the domain names");
		    System.exit(-1);
		}
	    
		System.out.println("\n2.For the given domain names:");
		System.out.println("");
		for (String domainName : args ) 
		{
			// using InetAddress satisfy requirements
			for (int i=0;i<InetAddress.getAllByName(domainName).length;i++)
			{
				System.out.println("The ip address of domain name "+ domainName +" is :" +InetAddress.getAllByName(domainName)[i].toString());
			}
			System.out.println("The Host name of "+ domainName +" is : "+InetAddress.getByName(domainName).getHostName());
		    System.out.println("The fully qualified domain name of "+ domainName +" is : "+InetAddress.getByName(domainName).getCanonicalHostName());
		    System.out.println(" ");
		}
		    System.out.println("\n3.The host name for the IP addresses:");
			System.out.println("\nThe host name of "+InetAddress.getByAddress(address).getHostAddress()+" is : "+InetAddress.getByAddress(address).getHostName());
			System.out.println("The host name of "+InetAddress.getByAddress(anotherAddress).getHostAddress()+" is : "+InetAddress.getByAddress(anotherAddress).getHostName());
			System.out.println("The host name of "+InetAddress.getByAddress(anotherAddress1).getHostAddress()+" is : "+InetAddress.getByAddress(anotherAddress1).getHostName());
			   
		}
		catch (UnknownHostException e) 
		{
		    System.out.println(e);
		}
	}
}


