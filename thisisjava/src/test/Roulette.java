package test;

import java.util.Random;
import java.util.Scanner;

class Roulette {
    // 필드 선언
    String id;
    String location;
    int totalPoint = 0; // 총 획득 포인트
    int successCount = 0; // 성공 포인트
    int failureCount = 0; // 실패 포인트
    int attempts = 0; // 시도 횟수
    int revenue = 0; // 매출액
    int price = 500; // 시도 금액

    static Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    // 생성자
    Roulette(String id, String location) {
        this.id = id;
        this.location = location;
    }

    // 충전 메서드
    void charge() {
        System.out.println("충전 금액을 입력하세요 ( 1000원 단위 ) : ");
        int amount = scanner.nextInt();
        if (amount % 1000 != 0) {
            System.out.println("충전은 1000원 단위로만 가능합니다");
        } else if (attempts > 0) {
            System.out.println("잔여 시도 횟수가 남아있습니다");
        } else {
            revenue += amount;
            attempts = amount / price;
            System.out.println(amount + "원 충전 완료");
            System.out.println("잔여 시도 횟수 : " + attempts);
        }
    }

    // 게임 시작 메서드
    void playGame() {
        if (attempts == 0) {
            System.out.println("충전 횟수가 없어 게임을 시작할 수 없습니다");
            return;
        }
        System.out.println("게임을 시작합니다 !");
        System.out.println();

        while (attempts > 0) {
            int result = random.nextInt(6) + 1;
            if (result >= 1 && result <= 4) {
                totalPoint += result;
                successCount++;
                System.out.println("성공 ! " + result + "포인트 획득!");
            } else {
                failureCount++;
                System.out.println("실패 !");
            }
            attempts--;
            System.out.println("남은시도 횟수 : " + attempts);
        }
        System.out.println("게임이 종료되었습니다");
        System.out.println("총 포인트 : " + totalPoint + " , 성공 횟수" + successCount + ", 실패횟수" + failureCount);
        totalPoint = 0;
        successCount = 0;
        failureCount = 0;
    }
    
    void over () {
        if(attempts > 0) {
            System.out.println("잔여 시도 횟수가 남아 있어 마감할 수 없습니다");
        } else {
            System.out.println("오늘의 총 매출액 : " + revenue + "원");
        }
    }

    void run() {
        while(true) {
            System.out.println("\n메뉴선택 : 1. 충전  2. 게임시작  3. 마감");
            System.out.print("선택: ");
            int choice = scanner.nextInt();

            if(choice == 1) {
                charge();
            } else if (choice == 2) {
                playGame();
            } else if ( choice == 3) {
                over();
                break;
            } else {
                System.out.println("올바른 선택을 해주세요");
            }
        }
    }


    public static void main(String[] args) {
        System.out.print("기기 ID를 입력해주세요 : ");
        String id = scanner.nextLine();
        System.out.print("지점명을 입력해 주세요 : ");
        String location = scanner.nextLine();

        Roulette machine = new Roulette(id, location);
        machine.run();
        scanner.close();
    }


}

