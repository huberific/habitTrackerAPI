package com.example.habitTracker.habit;

import javax.persistence.*;

@Entity // for hibernate
@Table // for database
public class Habit {

    @Id
    @SequenceGenerator(
            name = "habit_sequence",
            sequenceName = "habit_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "habit_sequence"
    )

    private Long id;
    private String name;
    private String year;
    private String month;
    private Boolean day1;
    private Boolean day2;
    private Boolean day3;
    private Boolean day4;
    private Boolean day5;
    private Boolean day6;
    private Boolean day7;
    private Boolean day8;
    private Boolean day9;
    private Boolean day10;
    private Boolean day11;
    private Boolean day12;
    private Boolean day13;
    private Boolean day14;
    private Boolean day15;
    private Boolean day16;
    private Boolean day17;
    private Boolean day18;
    private Boolean day19;
    private Boolean day20;
    private Boolean day21;
    private Boolean day22;
    private Boolean day23;
    private Boolean day24;
    private Boolean day25;
    private Boolean day26;
    private Boolean day27;
    private Boolean day28;
    private Boolean day29;
    private Boolean day30;
    private Boolean day31;

    // constructor
    public Habit() {
        this.id = 1L;
        this.name = "NA";
        this.year = "0";
        this.month = "NA";
        this.day1 = false;
        this.day2 = false;
        this.day3 = false;
        this.day4 = false;
        this.day5 = false;
        this.day6 = false;
        this.day7 = false;
        this.day8 = false;
        this.day9 = false;
        this.day10 = false;
        this.day11 = false;
        this.day12 = false;
        this.day13 = false;
        this.day14 = false;
        this.day15 = false;
        this.day16 = false;
        this.day17 = false;
        this.day18 = false;
        this.day19 = false;
        this.day20 = false;
        this.day21 = false;
        this.day22 = false;
        this.day23 = false;
        this.day24 = false;
        this.day25 = false;
        this.day26 = false;
        this.day27 = false;
        this.day28 = false;
        this.day29 = false;
        this.day30 = false;
        this.day31 = false;
    }

    public Habit(String name, String year, String month, Boolean day1, Boolean day2, Boolean day3, Boolean day4, Boolean day5, Boolean day6, Boolean day7, Boolean day8, Boolean day9, Boolean day10, Boolean day11, Boolean day12, Boolean day13, Boolean day14, Boolean day15, Boolean day16, Boolean day17, Boolean day18, Boolean day19, Boolean day20, Boolean day21, Boolean day22, Boolean day23, Boolean day24, Boolean day25, Boolean day26, Boolean day27, Boolean day28, Boolean day29, Boolean day30, Boolean day31) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.day1 = day1;
        this.day2 = day2;
        this.day3 = day3;
        this.day4 = day4;
        this.day5 = day5;
        this.day6 = day6;
        this.day7 = day7;
        this.day8 = day8;
        this.day9 = day9;
        this.day10 = day10;
        this.day11 = day11;
        this.day12 = day12;
        this.day13 = day13;
        this.day14 = day14;
        this.day15 = day15;
        this.day16 = day16;
        this.day17 = day17;
        this.day18 = day18;
        this.day19 = day19;
        this.day20 = day20;
        this.day21 = day21;
        this.day22 = day22;
        this.day23 = day23;
        this.day24 = day24;
        this.day25 = day25;
        this.day26 = day26;
        this.day27 = day27;
        this.day28 = day28;
        this.day29 = day29;
        this.day30 = day30;
        this.day31 = day31;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Boolean getDay1() {
        return day1;
    }

    public void setDay1(Boolean day1) {
        this.day1 = day1;
    }

    public Boolean getDay2() {
        return day2;
    }

    public void setDay2(Boolean day2) {
        this.day2 = day2;
    }

    public Boolean getDay3() {
        return day3;
    }

    public void setDay3(Boolean day3) {
        this.day3 = day3;
    }

    public Boolean getDay4() {
        return day4;
    }

    public void setDay4(Boolean day4) {
        this.day4 = day4;
    }

    public Boolean getDay5() {
        return day5;
    }

    public void setDay5(Boolean day5) {
        this.day5 = day5;
    }

    public Boolean getDay6() {
        return day6;
    }

    public void setDay6(Boolean day6) {
        this.day6 = day6;
    }

    public Boolean getDay7() {
        return day7;
    }

    public void setDay7(Boolean day7) {
        this.day7 = day7;
    }

    public Boolean getDay8() {
        return day8;
    }

    public void setDay8(Boolean day8) {
        this.day8 = day8;
    }

    public Boolean getDay9() {
        return day9;
    }

    public void setDay9(Boolean day9) {
        this.day9 = day9;
    }

    public Boolean getDay10() {
        return day10;
    }

    public void setDay10(Boolean day10) {
        this.day10 = day10;
    }

    public Boolean getDay11() {
        return day11;
    }

    public void setDay11(Boolean day11) {
        this.day11 = day11;
    }

    public Boolean getDay12() {
        return day12;
    }

    public void setDay12(Boolean day12) {
        this.day12 = day12;
    }

    public Boolean getDay13() {
        return day13;
    }

    public void setDay13(Boolean day13) {
        this.day13 = day13;
    }

    public Boolean getDay14() {
        return day14;
    }

    public void setDay14(Boolean day14) {
        this.day14 = day14;
    }

    public Boolean getDay15() {
        return day15;
    }

    public void setDay15(Boolean day15) {
        this.day15 = day15;
    }

    public Boolean getDay16() {
        return day16;
    }

    public void setDay16(Boolean day16) {
        this.day16 = day16;
    }

    public Boolean getDay17() {
        return day17;
    }

    public void setDay17(Boolean day17) {
        this.day17 = day17;
    }

    public Boolean getDay18() {
        return day18;
    }

    public void setDay18(Boolean day18) {
        this.day18 = day18;
    }

    public Boolean getDay19() {
        return day19;
    }

    public void setDay19(Boolean day19) {
        this.day19 = day19;
    }

    public Boolean getDay20() {
        return day20;
    }

    public void setDay20(Boolean day20) {
        this.day20 = day20;
    }

    public Boolean getDay21() {
        return day21;
    }

    public void setDay21(Boolean day21) {
        this.day21 = day21;
    }

    public Boolean getDay22() {
        return day22;
    }

    public void setDay22(Boolean day22) {
        this.day22 = day22;
    }

    public Boolean getDay23() {
        return day23;
    }

    public void setDay23(Boolean day23) {
        this.day23 = day23;
    }

    public Boolean getDay24() {
        return day24;
    }

    public void setDay24(Boolean day24) {
        this.day24 = day24;
    }

    public Boolean getDay25() {
        return day25;
    }

    public void setDay25(Boolean day25) {
        this.day25 = day25;
    }

    public Boolean getDay26() {
        return day26;
    }

    public void setDay26(Boolean day26) {
        this.day26 = day26;
    }

    public Boolean getDay27() {
        return day27;
    }

    public void setDay27(Boolean day27) {
        this.day27 = day27;
    }

    public Boolean getDay28() {
        return day28;
    }

    public void setDay28(Boolean day28) {
        this.day28 = day28;
    }

    public Boolean getDay29() {
        return day29;
    }

    public void setDay29(Boolean day29) {
        this.day29 = day29;
    }

    public Boolean getDay30() {
        return day30;
    }

    public void setDay30(Boolean day30) {
        this.day30 = day30;
    }

    public Boolean getDay31() {
        return day31;
    }

    public void setDay31(Boolean day31) {
        this.day31 = day31;
    }

    public void setDay(Integer dayIn) {
        switch (dayIn) {
            case 1:
                this.day1 = !this.day1;
                break;
            case 2:
                this.day2 = !this.day2;
                break;
            case 3:
                this.day3 = !this.day3;
                break;
            case 4:
                this.day4 = !this.day4;
                break;
            case 5:
                this.day5 = !this.day5;
                break;
            case 6:
                this.day6 = !this.day6;
                break;
            case 7:
                this.day7 = !this.day7;
                break;
            case 8:
                this.day8 = !this.day8;
                break;
            case 9:
                this.day9 = !this.day9;
                break;
            case 10:
                this.day10 = !this.day10;
                break;
            case 11:
                this.day11 = !this.day11;
                break;
            case 12:
                this.day12 = !this.day12;
                break;
            case 13:
                this.day13 = !this.day13;
                break;
            case 14:
                this.day14 = !this.day14;
                break;
            case 15:
                this.day15 = !this.day15;
                break;
            case 16:
                this.day16 = !this.day16;
                break;
            case 17:
                this.day17 = !this.day17;
                break;
            case 18:
                this.day18 = !this.day18;
                break;
            case 19:
                this.day19 = !this.day19;
                break;
            case 20:
                this.day20 = !this.day20;
                break;
            case 21:
                this.day21 = !this.day21;
                break;
            case 22:
                this.day22 = !this.day22;
                break;
            case 23:
                this.day23 = !this.day23;
                break;
            case 24:
                this.day24 = !this.day24;
                break;
            case 25:
                this.day25 = !this.day25;
                break;
            case 26:
                this.day26 = !this.day26;
                break;
            case 27:
                this.day27 = !this.day27;
                break;
            case 28:
                this.day28 = !this.day28;
                break;
            case 29:
                this.day29 = !this.day29;
                break;
            case 30:
                this.day30 = !this.day30;
                break;
            case 31:
                this.day31 = !this.day31;
                break;
        }

    }
}