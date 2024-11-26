use erp;
alter table Placement
add constraint organisation foreign key (organisation) references Organisation(id);

alter table Placement_Student
add constraint placement_fk foreign key (placement_id) references Placement(id);
alter table Placement_Student
add constraint student_id foreign key (student_id) references Student(Student_id);

alter table Student
add constraint domain foreign key (domain) references Domains(domain_id);
alter table Student
add constraint specialisation foreign key (specialisation) references Specialisation(specialisation_id);
alter table Student
add constraint student_placement_fk foreign key (placement_id) references Placement(id);
