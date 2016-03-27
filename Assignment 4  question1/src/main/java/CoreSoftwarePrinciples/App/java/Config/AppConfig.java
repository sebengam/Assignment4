package CoreSoftwarePrinciples.App.java.Config;

import CoreSoftwarePrinciples.App.java.ObeyOCP.OrderFood;
import CoreSoftwarePrinciples.App.java.ObeySRP.EmployeeDesc;
import CoreSoftwarePrinciples.App.java.ObeySRP.EmployeeSal;
import CoreSoftwarePrinciples.App.java.ObeySRP.EmployeeSalImpl;
import CoreSoftwarePrinciples.App.java.VioletOCP.OrderFoodImpl_v;
import CoreSoftwarePrinciples.App.java.VioletOCP.OrderFood_v;
import CoreSoftwarePrinciples.App.java.VioletSRP.Employee;
import CoreSoftwarePrinciples.App.java.VioletSRP.EmployeeImpl;
import org.springframework.context.annotation.Bean;

/**
 * Created by student on 2016/03/27.
 */
public class AppConfig
{

    /*********************************************
     SRP
     *********************************************/

    @Bean(name ="emp")
    public Employee getEmp(){ return new EmployeeImpl() {
        @Override
        public String empDescription() {
            return null;
        }
    };}

    @Bean(name ="empSal")
    public EmployeeSal getEmpSal(){ return new EmployeeSalImpl();}

    @Bean(name ="empDesc")
    public EmployeeDesc getEmpDesc(){ return new EmployeeDescImpl() {
        @Override
        public String empDescription() {
            return null;
        }
    };}
    /*********************************************
     OCP
     *********************************************/

    @Bean(name ="order_v")
    public OrderFood_v getV_Order(){ return new OrderFoodImpl_v();}
    @Bean(name ="order")
    public OrderFood getOrder(){ return new OrderFoodImpl2() {
        @Override
        public String getOrder() {
            return null;
        }

        @Override
        public String pay() {
            return null;
        }
    }; }
    /*********************************************
     LSP
     *********************************************/
    @Bean(name="ford")
    public Car getFord(){ return new CarFordImpl();}
    @Bean(name="tesla")
    public Car getTesla(){ return new CarTeslaImpl();}

    private abstract class EmployeeDescImpl implements EmployeeDesc {
    }

    private abstract class OrderFoodImpl2 implements OrderFood {
    }

    private class Car {
    }

    private class CarFordImpl extends Car {
    }

    private class CarTeslaImpl extends Car {
    }
}

