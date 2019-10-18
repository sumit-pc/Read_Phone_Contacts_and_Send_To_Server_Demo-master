# Read Phone Contacts Using Content Provider
You can read phone contacts using [Content Provider](http://developer.android.com/intl/ru/guide/topics/providers/content-providers.html). With the help of this content provider we can communicate with the contacts app and query the URIs  and columns to get contact information and it will return as contact name, all contact numbers, all email addresses, company name, etc.
<br>
Content providers manage access to a structured set of data. They encapsulate the data, and provide mechanisms for defining data security. Content providers are the standard interface that connects data in one process with code running in another process. A content provider is only required if you need to share data between multiple applications. For example, the contacts data is used by multiple applications and must be stored in a content provider. If you don’t need to share data amongest multiple applications you can use a database directly via [SQLite Database](http://androhub.com/android-sqlite-database/).
<br>
When you want to access data in a content provider, you use the [ContentResolver](http://developer.android.com/intl/ru/reference/android/content/ContentResolver.html) object in your application’s Context to communicate with the provider as a client. The ContentResolver object communicates with the provider object, an instance of a class that implements ContentProvider. The provider object receives data requests from clients, performs the requested action, and returns the results.
<br

![alt text](https://github.com/sumit-pc/Read_Phone_Contacts_and_Send_To_Server_Demo-master/blob/master/Screenshot_1571395665.png)
