package com.javabrains.web.Util;

import java.sql.Connection;
import java.sql.DriverManager;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Utility {
	
	 private static StandardServiceRegistry registry;
	    private static SessionFactory sessionFactory;

	    public static SessionFactory getSessionFactory() {
	        if (sessionFactory == null) {
	            try {
	                // Create registry
	                registry = new StandardServiceRegistryBuilder().configure().build();

	                // Create MetadataSources
	                MetadataSources sources = new MetadataSources(registry);

	                // Create Metadata
	                Metadata metadata = sources.getMetadataBuilder().build();

	                // Create SessionFactory
	                sessionFactory = metadata.getSessionFactoryBuilder().build();

	            } catch (Exception e) {
	                e.printStackTrace();
	                if (registry != null) {
	                    StandardServiceRegistryBuilder.destroy(registry);
	                }
	            }
	        }
	        return sessionFactory;
	    }

	    public static void shutdown() {
	        if (registry != null) {
	            StandardServiceRegistryBuilder.destroy(registry);
	        }
	    }
	
	
	
	/*
	 * public Connection getConnection() throws Exception {
	 * 
	 * Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); Connection con
	 * = DriverManager.getConnection(
	 * "jdbc:sqlserver://100.111.111.42:1433;databaseName=test;user=test;password=test"
	 * );
	 * 
	 * System.out.println("connection established");
	 * 
	 * return con;
	 * 
	 * }
	 */
	

}
