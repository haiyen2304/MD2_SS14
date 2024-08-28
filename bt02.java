package baitap;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class bt02 {
    public static void main(String[] args) {
        // lay ngay thang hien tai cua khu vuc
        LocalDateTime now = LocalDateTime.now();

        // In ngày giờ hiện tại của hệ thống
        System.out.println("Ngày giờ hiện tại của hệ thống: " + now);

        // Chuyển đổi sang múi giờ Asia/Tokyo
        ZoneId asiaTokyoZone = ZoneId.of("Asia/Tokyo");
        LocalDateTime asiaTokyoDateTime = now.atZone(asiaTokyoZone).toLocalDateTime();
        System.out.println("Ngày giờ ở Tokyo: " + asiaTokyoDateTime);

        // Chuyển đổi sang múi giờ Australia/Sydney
        ZoneId australiaSydneyZone = ZoneId.of("Australia/Sydney");
        LocalDateTime australiaSydneyDateTime = now.atZone(australiaSydneyZone).toLocalDateTime();
        System.out.println("Ngày giờ ở Sydney: " + australiaSydneyDateTime);

        // Chuyển đổi sang múi giờ America/Sao_Paulo
        ZoneId americaSaoPauloZone = ZoneId.of("America/Sao_Paulo");
        LocalDateTime americaSaoPauloDateTime = now.atZone(americaSaoPauloZone).toLocalDateTime();
        System.out.println("Ngày giờ ở São Paulo: " + americaSaoPauloDateTime);

        //lay thoi gian hien tai
        LocalDate localDate1 = LocalDate.now();
        System.out.println(localDate1);
        // tinh so ngay trong thang hien tai

        LocalDate today = LocalDate.now();


        int year = today.getYear();
        int month = today.getMonthValue();


        YearMonth yearMonth = YearMonth.of(year, month);


        int daysInMonth = yearMonth.lengthOfMonth();
        int daysInYear = yearMonth.lengthOfYear();


        System.out.println("Số ngày trong tháng hiện tại là: " + daysInMonth);
        System.out.println("Số ngày trong nam hiện tại là: " + daysInYear);
        // chuyen doi chuoi qua localdate
        String dateString = "2024-06-24";

        // Định dạng của chuỗi ngày
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Chuyển đổi chuỗi thành đối tượng LocalDate
        LocalDate date = LocalDate.parse(dateString, formatter);

        // In đối tượng LocalDate đã chuyển đổi
        System.out.println("Đối tượng LocalDate: " + date);


    }
}
