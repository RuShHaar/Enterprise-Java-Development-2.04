Perfekt!
Hinweis:

* Klassennamen immer gross schreiben. Auch die Custom Exceptions.

Hast auch custom Exceptions erstellt. Allerdings wäre in diesem Fall evtl. die Klasse IllegalArgumentException genügend:
https://docs.oracle.com/javase/7/docs/api/java/lang/IllegalArgumentException.html

Um zu üben ist es super, aber es muss immer ein Mehrwert haben, hier ein paar Tipps: https://stackify.com/java-custom-exceptions/

*You should provide detailed information about the situation that caused the exception, and you should not remove anything that might be useful to the caller.
You often can achieve that by using standard exceptions with good messages.
The Java Exception class describes the kind of event, and the message provides detailed information about it.
You can take this concept one step further by using a custom exception.
Custom exceptions provide you the flexibility to add attributes and methods that are not part of a standard Java exception.
These can store additional information,
like an application-specific error code, or provide utility methods that can be used to handle or present the exception to a user.*