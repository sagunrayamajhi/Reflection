package miscellaneous;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by srayamajhi on 2/19/19.
 */
public class regex_check {

    public static void main(String[] args) {
//        String rev_code = "123AAAA";
//        System.out.println((rev_code.matches("^(?![0-9]*$)(?![A-z]*$)[a-zA-Z0-9]+$") || rev_code.matches("[0-9]*")));
//        System.out.println((rev_code.matches("[A-Za-z]*")));
//        String final_stage = "stage3";
//        String account= "abp_abd";
//        String type = "Laboratory";
//        System.out.println(final_stage+"/"+account.toString()+"/"+"makalu"+"/"+type.toString().replace(type.toString(),
//                (type.toString())).replace("Laboratory","Lab").replace("Prospectiveriskgaps", "ProspectiveRiskGaps") + ".csv");
//
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String currentDate = "";//left 7
        String claimPaidDate = "";//left 7
        int offsetMonths = Months.monthsBetween(new DateTime(currentDate), new DateTime(claimPaidDate)).getMonths();
        String updatedDate= date;

        if (StringUtils.isNotNull(date) && !date.equalsIgnoreCase("2099-12-31")) {
            updatedDate = DateUtils.datePlusMonth(date, Math.abs(offsetMonths));
        }
        return updatedDate;
    }


}
