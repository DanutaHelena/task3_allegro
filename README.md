# task3_allegro
task3
3 different JSON parsers were used, all three complained about not consistent data form
in code above there was an error:
com.google.gson.stream.MalformedJsonException: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 4998com.google.gson.stream.MalformedJsonException: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 4998
I focused on parsing data from GitHub RestAPI to JSON to have clean code and solution
however it looks like standard operation on STRING would be better approach, however I run out of time.
If it would be possible to give me another chance it would be very appreciated. Thank you in advance.

Application can be opened on http://localhost:8090/repos. 
If user repository doesn't exist it throws 404. 
