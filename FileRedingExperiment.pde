File values;

void setup(){
  testMethod();
}

void testMethod(){
  BufferedReader reader = createReader("fy20_adc_data_file_88_degrees.csv");
  BufferedReader lineCounter = createReader("fy20_adc_data_file_88_degrees.csv");
  String line = null;
  int lineCount = 0;
  
  try {
    while ((line = lineCounter.readLine()) != null) {
      lineCount++; 
    }
    println(lineCount);
    lineCounter.close();
  }
  catch (IOException e){
  e.printStackTrace();
  }
  
  try {
    String[][] values = new String[lineCount][4];
    int place = 0;
    while ((line = reader.readLine()) != null) {
      values[place] = split(line, ",");
      println(place);
    }
    
    //for(int i = 0; i < values.length; i++){
      //for(int j = 0; j < values[i].length; j++){  
        //print(values[i][j] + "\t");
      //}
     // print("\n");
    //}
    reader.close();
  } catch (IOException e) {
    e.printStackTrace();
  }
} 
