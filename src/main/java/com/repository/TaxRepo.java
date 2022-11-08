package com.repository;


import com.domain.Info;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import javax.validation.Valid;
import java.sql.*;

@Repository
public class TaxRepo {

    private static DataSource dataSource;

    private static final String ALL = "select id, name, created_on from departments";

    private static final String SELECT_ONE = "select * from taxliability";

    private static final String CREATE = "insert into info (BasicSal, HouseRent, ConAllowance, MediAllowance, extra) values (?, ?, ?, ?, ?)";

    private static final String taxCal = "insert into taxcalculation (BSalary, Hrent, CAllowance, MAllowance, extra, total) values (?, ?, ?, ?, ?, ?)";


    public TaxRepo(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public static boolean create(@Valid Info info) throws SQLException {
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(CREATE);

        preparedStatement.setInt(1, info.getBSal());
        preparedStatement.setInt(2,info.getHrent());
        preparedStatement.setInt(3,info.getCAllowance());

        preparedStatement.setInt(4,info.getMAllowance());
        preparedStatement.setInt(5,info.getExtra());
        return preparedStatement.execute();
    }
    public static boolean createBreakdown(@Valid Info info) throws SQLException {

        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(taxCal);

        int BasicSal = 12* info.getBSal();
        int Hrent = BasicSal/2;
        int ConveyCAllownce = 12* info.getCAllowance();
        int MedicalAllownce = 12* info.getMAllowance();
        int extra = 12 * info.getExtra();

        int total = BasicSal + Hrent + ConveyCAllownce + MedicalAllownce+ extra;



        preparedStatement.setInt(1,BasicSal );
        preparedStatement.setInt(2,Hrent);
        preparedStatement.setInt(3,ConveyCAllownce);
        preparedStatement.setInt(4,MedicalAllownce);
        preparedStatement.setInt(5,extra);
        preparedStatement.setInt(6,total);


        return preparedStatement.execute();
    }


}
