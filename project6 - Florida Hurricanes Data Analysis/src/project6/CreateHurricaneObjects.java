

package project6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

		public class CreateHurricaneObjects {															     //input file is split and stored

			File inputFile = new File("NamedFloridaHurricanes.txt");
			private int fileLength = getFileLength(inputFile);
			Hurricane[] hurricanes = new Hurricane[fileLength];

			
			private void setHurricanesArray() {

				try (Scanner scanner = new Scanner(inputFile);) {											//reading the input file

					for (int i = 0; i < fileLength; i++) {

						String line = scanner.nextLine();
						String[] tokens = line.split("[,:]");												//splitting the data

						hurricanes[i] = new Hurricane(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);	//storing the data

					}

				} catch (FileNotFoundException e) {

					System.out.println("Files do not exist in the current directory, please locate the files then try again.");
					System.exit(20);

				}
			}

			private int getFileLength(File file) {															//for calculating the file length

				int i = 0;

				try (Scanner scanner = new Scanner(file);) {

					
					while (scanner.hasNext()) {

						scanner.nextLine();
						i++;

					}

				} catch (FileNotFoundException e) {

					System.out.println(
							"Unable to locate the files to calculate the length of the file, please locate the files and try again.");
					System.exit(20);

				}
				return i;
			}

			
			public void driver() {																			//hurricane driver object called by main menu

				getHurricanesArray();

			}

			
			public Hurricane[] getHurricanesArray() {														//setHurricanesArray is being called for
				setHurricanesArray();
				return hurricanes;

			}

		}
