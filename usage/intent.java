Intent i = new Intent();
i.setComponent(new ComponentName("com.onmuapps.mpdownloader", "com.onmuapps.mpdownloader.DownloadActivity"));
i.putExtra("url", url); // Dosya URL'si
i.putExtra("fileName", name); // Yalnızca dosya adını, uzantısı ile birlikte kulanın. Örnek: dosya.mp4
ArrayList<Header> headers = new ArrayList<>();
headers.add(new Header("Cookie", cookie)); // İsteğe bağlı header
headers.add(new Header("Referer", referer)); // İsteğe bağlı header
headers.add(new Header("User-Agent", ua)); // İsteğe bağlı header
Gson gson = new Gson();
i.putExtra("headers", gson.toJson(headers));
context.startActivity(i);
