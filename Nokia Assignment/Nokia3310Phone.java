import java.util.Scanner;

public class Nokia3310Phone {

public static void main (String[] args){

		Scanner obtain = new Scanner(System.in);

String phone = """
       NOKIA 3310-Connecting People....

       """;
System.out.print(phone);

String phoneMenu = """	
	PHONE MENU

    Press 1 - Phone book
    Press 2 - Messages
    Press 3 - Chat
    Press 4 - Call register
    Press 5 - Tones 
    Press 6 - Settings
    Press 7 - Call divert
    Press 8 - Games
    Press 9 - Calculator 
    Press 10 - Reminders
    Press 11 - Clock
    Press 12 - Profiles
    Press 13 - SIM services
    
    
    """;

System.out.print(phoneMenu);


int menuSelection = obtain.nextInt();
switch(menuSelection){

    case 1 -> {System.out.println("Phone book");

        String phoneBook = """
        
        Press 1 - Search
        Press 2 - Service Nos.1
        Press 3 - Add name
        Press 4 - Erase
        Press 5 - Edit
        Press 6 - Assign tone
        Press 7 - Send b'card
        Press 8 - Option
        Press 9 - Speed dials
        Press 10 -Voice Tags

	    """; 

    System.out.print(phoneBook);

int menuOption= obtain.nextInt();

switch(menuOption){

    case  8 -> {System.out.println("Option");

        String option = """
        
        
        Press 1 - Type of view
        Press 2 - Memory status
        
        """;

System.out.println(option);

            }

        } 

    }
}


int messageMenu = obtain.nextInt();

switch(messageMenu){

    case  2 -> {System.out.println("Messages");
                
             String message = """
        
        Press 1 - Write Messages
        Press 2 - Inbox
        Press 3 - Outbox
        Press 4 - Picture messages
        Press 5 - Templates
        Press 6 - Smileys
        Press 7 - Message settings
        Press 8 - Info service
        Press 9 - Voice mailbox number
        Press 10- Service command editor 

        """;
System.out.println(message);

int messageSetting = obtain.nextInt();

switch(messageSetting){

        case  7 -> {System.out.println("Message Settings");

        String messageSet = """
        
        
        Press 1 - Set
        Press 2 - Common
        
        """;

System.out.println(messageSet);


int setmenu = obtain.nextInt();

switch(setmenu){

        case  1 -> {System.out.println("Set");

        String set = """
        
        
        Press 1 - Message centre number
        Press 2 - Message sent as
        Press 3 - Message validity
        
        """;

System.out.println(set);

int commonmenu= obtain.nextInt();

switch(commonmenu){

        case  2 -> {System.out.println("Common");

        String common = """


        Press 1 - Delivery reports
        Press 2 - Reply via same centre
        Press 3 - Character support

        """;

System.out.println(common);


       }
    }
   }
  }
 }
 }
 }
} 



int chatMenu = obtain.nextInt();

switch(chatMenu){

    case 3 -> {System.out.println("Chat");


}
}



int callRegistermenu = obtain.nextInt();

switch(callRegistermenu){

    

    case 4 -> {System.out.println("Call Register");

        String callRegister = """
        
        Press 1 - Missed calls 
        Press 2 - Received calls
        Press 3 - Dialled numbers
        Press 4 - Erase recent call lists
        Press 5 - Show call duration
        Press 6 - Show call costs
        Press 7 - Call cost settings
        Press 8 - Prepaid credit
         
        """;

System.out.println(callRegister );


int callDurationmenu = obtain.nextInt();

switch(callDurationmenu){

        case  5 -> {System.out.println("Call Duration");

        String callDuration = """
        
        
        Press 1 - Last call duration
        Press 2 - All calls duration
        Press 3 - Received calls duration
        Press 4 - Dialled calls duration
        Press 5 - Clear timers
        
        """;

System.out.println(callDuration);


int callCostMenu = obtain.nextInt();

switch(callCostMenu){

        case  6 -> {System.out.println("Call Cost");

        String callCost = """
        
        
        Press 1 - Last call cost
        Press 2 - All calls cost
        Press 3 - Clear counters
        
        
        """;

System.out.println(callCost);


int costSettingMenu = obtain.nextInt();

switch(costSettingMenu){

        case  7 -> {System.out.println("Call Cost Settings");

        String callCostSetting = """
        
        
        Press 1 - Call cost limit
        Press 2 - Show cost in
        
        """;

System.out.println(callCostSetting);


            }
                }
            }
            } 
        }
        }
    }
}


int tonesMenu = obtain.nextInt();

switch(tonesMenu){

    case  5 -> {System.out.println("Tones");
                
             String tones = """
        
        Press 1 - Ringing tone
        Press 2 - Ringing volume 
        Press 3 - Incoming call alert
        Press 4 - Composer
        Press 5 - Message alert tone
        Press 6 - Keypad tones
        Press 7 - Warning and  game tones
        Press 8 - Vibrating alert
        Press 9 - Screen saver
        

        """;
System.out.println(tones);


    } 
} 




int settingsMenu = obtain.nextInt();

switch(settingsMenu){

    case  6 -> {System.out.println("Settings");
                
             String setting = """
        
        Press 1 - Call settings 
        Press 2 - Phone settings 
        Press 3 - Security settings
        Press 4 - Restore factory settings
        
        """;
System.out.println(setting);



    }
}


int callSettingMenu = obtain.nextInt();

switch(callSettingMenu){

    case  1 -> {System.out.println("Call Settings");
                
             String callSetting = """
        
        Press 1 - Automatic redial
        Press 2 - Speed dailing
        Press 3 - Call waiting options
        Press 4 - Own number sending
        Press 5 - Phone line in use
        Press 6 - Automatic answer
        Press 7 - Warning and  game tones
        Press 8 - Vibrating alert
        Press 9 - Screen saver
        

        """;

System.out.println(callSetting);


   } 
}


int phoneSettingsMenu = obtain.nextInt();

switch(phoneSettingsMenu){

    case  2 -> {System.out.println("Phone Settings");
                
             String phoneSetting = """
        
        Press 1 - Language
        Press 2 - Cell info display
        Press 3 - Welcome note
        Press 4 - Network selection
        Press 5 - Lights
        Press 6 - Comfirm SIM service actions
        

        """;

System.out.println(phoneSetting);




} 
} 




int securitySettingsMenu = obtain.nextInt();

switch(securitySettingsMenu){

    case  3 -> {System.out.println("Security Settings");
                
             String securitySetting = """
        
        Press 1 - PIN code request
        Press 2 - Call barring serivce
        Press 3 - Fixed dialing
        Press 4 - Closed user group
        Press 5 - Phone security
        Press 6 - Change access codes
        

        """;

System.out.println(securitySetting);



    }
}



int  calldivertMenu = obtain.nextInt();


switch(calldivertMenu){

    case  7 -> {System.out.println("Call Divert");



}
}




int  gamesMenu = obtain.nextInt();


switch(gamesMenu){

    case  8 -> {System.out.println("Games");



}
}




int  calculatorMenu = obtain.nextInt();


switch(calculatorMenu){

    case  9 -> {System.out.println("Calculator");



}
}



int  reminderMenu = obtain.nextInt();


switch(reminderMenu){

    case  10 -> {System.out.println("Reminders");



}
}






int clockMenu = obtain.nextInt();

switch(clockMenu){

    case  11 -> {System.out.println("Clock");
                
             String clock = """
        
        Press 1 - Alarm clock
        Press 2 - Clock settings
        Press 3 - Date setting
        Press 4 - Stopwatch
        Press 5 - Countdown timer
        Press 6 - Auto update of date and time 
        

        """;

System.out.println(clock);





}
}




int profileMenu = obtain.nextInt();

switch(profileMenu){

    case  12 -> {System.out.println("Profile");
                
             




}
}



int simServiceMenu = obtain.nextInt();

switch(simServiceMenu){

    case  13 -> {System.out.println("SIM Services");
                
             




}
}





    }
}
