package module3;

import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;

import java.util.ArrayList;

import java.util.Iterator;

public class spellchecker {

private static ArrayList<String> dictionaryWordsList = new ArrayList<String>(); 

private static ArrayList<String> fileCheckWordsList = new ArrayList<String>(); 

public static void main(String[] args) throws IOException {



if(args.length < 2){

System.out.println("dictionary.txt");

}

String fileToCheck = args[0]; 

String dictionaryFile = args[1]; 

readFileAndSpellCheck(fileToCheck,dictionaryFile); // read files

}


private static void readFileAndSpellCheck(String fileToCheck,String dictFile) throws IOException {

String line;

try(BufferedReader br = new BufferedReader(new FileReader(fileToCheck))){


while ((line = br.readLine()) != null) {

fileCheckWordsList.add(line);

}

}

try(BufferedReader br2 = new BufferedReader(new FileReader(dictFile))){


while ((line = br2.readLine()) != null) {

dictionaryWordsList.add(line);

}

}


Iterator<String> iterator = fileCheckWordsList.iterator();

while (iterator.hasNext()) { 

String word = iterator.next(); 

if (!dictionaryWordsList.contains(word)) { 

System.out.println("Unkonwn Word!! "+word); 

}

}

}

}


