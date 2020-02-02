package com.example.ellehacks;

public static JSONObject getJSONObjectFromURL(String urlString) throws IOException, JSONException {
    HttpURLConnection urlConnection = null;
    URL url = new URL(urlString);
    urlConnection = (HttpURLConnection) url.openConnection();
    urlConnection.setRequestMethod("GET");
    url.setRequestProperty("authtoken" + ":" + "f8e573edb6594cca")
    urlConnection.setReadTimeout(10000 /* milliseconds */ );
    urlConnection.setConnectTimeout(15000 /* milliseconds */ );
    urlConnection.setDoOutput(true);
    urlConnection.connect();

    BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
    StringBuilder sb = new StringBuilder();

    String line;
    while ((line = br.readLine()) != null) {
        sb.append(line + "\n");
    }
    br.close();

    String jsonString = sb.toString();
    System.out.println("JSON: " + jsonString);

    return new JSONObject(jsonString);
}