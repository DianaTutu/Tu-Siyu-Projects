package Business;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.UserOrganization;
import Business.Person.Person;
import Business.Reader.AnimalReader;
import Business.Reader.BotanistReader;
import Business.Reader.FieldGroupReader;
import Business.Reader.GeologistReader;
import Business.Reader.PlantReader;
import Business.Reader.ProjectReader;
import Business.Reader.UserReader;
import Business.Reader.VetReader;
import Business.Role.AdminRole;
import Business.Role.EmployeeRole;
import Business.Role.FinacialExecutorRole;
import Business.Role.GovernerRole;
import static Business.Role.Role.RoleType.User;
import Business.Role.SystemAdminRole;
import Business.Role.UserRole;
import Business.Species.AnimalSpecies;
import Business.Species.AnimalDirectory;
import Business.Species.PlantDirectory;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {

    public static EcoSystem configure() throws IOException{
     
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        Network network = system.createAndAddNetwork("Boston");
        //create an enterprise
        Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise("Boston NationalPark",Enterprise.EnterpriseType.NationalPark);
        //Second Enterprice
        Enterprise enterprise1 = network.getEnterpriseDirectory().createAndAddEnterprise("Boston Government",Enterprise.EnterpriseType.Government);
          //Read Data
        AnimalReader ar = new AnimalReader();
        enterprise.setAnimalDirectory(ar.read());
   
        PlantReader pr = new PlantReader();
        enterprise.setPlantDirectory(pr.read());

        ProjectReader prr = new ProjectReader();
        enterprise.setProjectDirectory(prr.read());
        
        //initialize some organizations
        Organization userOrganization = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.User);
        Organization employeeOrganization = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Employee);
        Organization adminOrganization = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Admin);
        
        //Second Enterprise Organizations
        Organization governerOrganization = enterprise1.getOrganizationDirectory().createOrganization(Organization.Type.Governer);
        Organization finacialOrganization = enterprise1.getOrganizationDirectory().createOrganization(Organization.Type.Finacial);
        
        //have some persons
        UserReader ur = new UserReader();
        enterprise.getOrganizationDirectory().getOrganizationList().get(0).setUserAccountDirectory(ur.read());
        
        VetReader vr = new VetReader();
        for(UserAccount u: vr.read().getUserAccountList())
         enterprise.getOrganizationDirectory().getOrganizationList().get(1).getUserAccountDirectory().getUserAccountList().add(u);
        BotanistReader br = new BotanistReader();
         for(UserAccount uu: br.read().getUserAccountList())
        enterprise.getOrganizationDirectory().getOrganizationList().get(1).getUserAccountDirectory().getUserAccountList().add(uu);
         GeologistReader gr = new GeologistReader();
         for(UserAccount uuu: gr.read().getUserAccountList())
        enterprise.getOrganizationDirectory().getOrganizationList().get(1).getUserAccountDirectory().getUserAccountList().add(uuu);
         FieldGroupReader fr = new FieldGroupReader();
         for(UserAccount uuuu: fr.read().getUserAccountList())
         enterprise.getOrganizationDirectory().getOrganizationList().get(1).getUserAccountDirectory().getUserAccountList().add(uuuu);
             
        
//        Person user = system.getPersonDirectory().createPerson("User");
//        user.setTag("User");
//        Person employee = system.getPersonDirectory().createPerson("Employee");
//        employee.setTag("employee");
        Person admin = system.getPersonDirectory().createPerson("Admin");
        admin.setTag("Admin");
        Person sysadmin = system.getPersonDirectory().createPerson("Sysadmin");
        //Second Enterprise persons
        Person governer = system.getPersonDirectory().createPerson("Governer");
        governer.setTag("Governer");
        Person finacialExecutor = system.getPersonDirectory().createPerson("Finacial Executor");
        governer.setTag("Finacial Executor");
        
        //create user account
//        UserAccount u = userOrganization.getUserAccountDirectory().createUserAccount("user", "user", user, new UserRole());
//        UserAccount e = employeeOrganization.getUserAccountDirectory().createUserAccount("employee", "employee", employee, new EmployeeRole());
        UserAccount a = adminOrganization.getUserAccountDirectory().createUserAccount("admin", "admin", admin, new AdminRole());

//        UserAccount a = enterprise.getUserAccountDirectory().createUserAccount("admin", "admin", admin, new AdminRole());
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", sysadmin, new SystemAdminRole());
        
        //create 2nd enterprise account
        
        UserAccount g = governerOrganization.getUserAccountDirectory().createUserAccount("governor", "111111", governer, new GovernerRole());
        UserAccount f = finacialOrganization.getUserAccountDirectory().createUserAccount("financial", "111111", finacialExecutor, new FinacialExecutorRole());
        
        return system;
    }
     
}
