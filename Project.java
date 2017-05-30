package project;

import java.sql.*;
import java.util.*;
import java.io.*;

public class Project {

    public static void main(String[] args) {
              
        DriverExampleProp connection = new DriverExampleProp();
        connection.connect();
        buttons b = new buttons();
        b.butt();
     
    }
    
}


