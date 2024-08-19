# FileUpload
Project1-> UploadFile, Upload a csv file using Spring boot and persist its data in database
1-> created a packages and files for model,controller,repository and service layers.
2-> Lombok dependency caused initial problems, hence lombok dependency and its IDE plugin(eclipse in my case) must be installed configured properly.
3-> Created a schema in the DB before running, JPA took care thereafter.
4-> Created a csv file in notepad.
5-> used swagger UI to test the working of the endpoint.
access it from here(http://localhost:8080/swagger-ui/index.html) change port address accordingly.
6-> Tested the fileUpload API it was working fine and crossed checked the DB to view the table records, all were added.
