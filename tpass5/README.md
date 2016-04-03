*Car Hiring System Domain Model*

*Introduction*
The comfort of having a vehicle at your disposal is a luxury that is easy to get used to and an inconvenience when that
luxury is not available to you. Car hiring services have been around for a very long time to bridge this comfort gap,
primarily for people who do a lot of traveling i.e. business people, and tourists. However, chauffeur driven car hiring
services are not as popular, considering that the people who often hire cars are foreign to the particular location.
That is what this system will be offering, chauffeur driven car hiring services.

*Class Diagram of the Domain Model*
The domain of the chauffeur driven car hiring service I am developing.
![Domain Model](/model.png)

*Description of the Domain Model and its Invariants*
Based on the domain model, the user should be able to set a reservation for a car and a chauffeur if they desire one.
The user is allowed to choose from four different car categories and can only have one booking at a time.  After making
the necessary selections to complete the reservation, the user then makes the required payment. The reservation is then
submitted to the system. This system requires two key employees, the Site Manager and the Business Administrator. The
business administrator mainly handles the running of the business, the cars and their availability, the managing of the
chauffeurs, and keeping the user reservations in order. The site manager updates the necessary changes on the business
side to the site.
