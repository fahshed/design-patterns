package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);

		List<DriveComponent> directory = new ArrayList<>();
		List<DriveComponent> drivelist = new ArrayList<>();

		int i;
		int choice;
		while(true) {
			//Drives
			for(i=0; i<drivelist.size(); i++) {
				System.out.println((i+1) + ".Enter Drive " + drivelist.get(i).getName());
			}
			if(i>0) {
				System.out.println("-------------");
			}
			System.out.println((i+1) + ".Create new Drive");
			i++;
			System.out.println((i+1) + ".Quit");

			choice = input.nextInt();
			choice--;

			if(choice==drivelist.size()) {
				System.out.print("Give a capital letter drive name: ");
				drivelist.add(new Drive(input.next(),"Drive"));
			}
			else if(choice==(drivelist.size()+1)) {
				break;
			}
			else if(choice<drivelist.size()) {
				System.out.println();
				//Folders
				DriveComponent open = drivelist.get(choice);
				directory.add(open);

				while(true) {
					open.getDirectory();

					for (i = 0; i < open.getComponentListSize(); i++) {
						System.out.println((i + 1) + "." + open.getComponent(i).getName());
					}
					if(i>0) {
						System.out.println("-------------");
					}
					System.out.println((i + 1) + ".Create Folder");
					i++;
					System.out.println((i + 1) + ".Create File");
					i++;
					System.out.println((i + 1) + ".List");
					i++;
					System.out.println((i + 1) + ".Details");
					i++;
					System.out.println((i + 1) + ".Delete");
					i++;
					System.out.println((i + 1) + ".Back");

					choice = input.nextInt();
					choice--;

					if(choice==open.getComponentListSize()) {
						System.out.print("Give folder name: ");
						new Folder(input.next(), "Folder", directory);
					}
					else if(choice==(open.getComponentListSize()+1)) {
						System.out.print("Give file name: ");
						new File(input.next(), "File", directory);
					}
					else if(choice==(open.getComponentListSize()+2)) {
						open.list();
					}
					else if(choice==(open.getComponentListSize()+3)) {
						open.details();
					}
					else if(choice==(open.getComponentListSize()+4)) {
						if(open.getType().equalsIgnoreCase("Drive")) {
							drivelist.remove(open);
							directory.remove(directory.size()-1);
							break;
						}
						else {
							DriveComponent component = directory.get(directory.size() - 2);
							directory.remove(directory.size()-1);
							component.removeComponent(open);
							open = component;
						}
					}
					else if(choice==(open.getComponentListSize()+5)) {
						if(open.getType().equalsIgnoreCase("Drive")) {
							directory.remove(directory.size()-1);
							break;
						}
						directory.remove(directory.size()-1);
						open = directory.get(directory.size()-1);

					}
					else if(choice<open.getComponentListSize()) {
						if(open.getComponent(choice).getType().equalsIgnoreCase("File")) {
							int filechoice;
							while(true) {
								open.getComponent(choice).getDirectory();
								System.out.println("1.List\n2.Details\n3.Delete\n4.Back");
								filechoice = input.nextInt();
								if(filechoice==1) {
									open.getComponent(choice).list();
								}
								else if(filechoice==2) {
									open.getComponent(choice).details();
								}
								else if(filechoice==3) {
									open.removeComponent(open.getComponent(choice));
									break;
								}
								else if(filechoice==4) {
									break;
								}
								System.out.println();
							}
						}
						else {
							open = open.getComponent(choice);
							directory.add(open);
						}
					}

					System.out.println();
				}
			}

			System.out.println();
		}
    }
}

