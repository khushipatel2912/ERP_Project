INSERT INTO Domains (domain_id, program, batch, capacity, qualification) VALUES
(1, 'Computer Science', 2024, 1500, 'MTECH'),
(2, 'Data Science', 2024, 50, 'BTECH'),
(3, 'Digital Society', 2023, 40, 'BTECH'),
(4, 'Artificial Intelligence', 2024, 70, 'BTECH'),
(5, 'Electronic communication', 2023, 30, 'MTECH');

INSERT INTO Organisation (id, name, address) VALUES
(1, 'Tech Innovators', 'Plot 12, DLF Cyber City, Gurgaon, Haryana, India'),
(2, 'Green Energy Solutions', '35 Solar Tech Park, Gandhinagar, Gujarat, India'),
(3, 'CyberSecure Ltd.', '22 IT Park, Salt Lake City, Kolkata, West Bengal, India'),
(4, 'AI NextGen', '18 Knowledge Corridor, Gachibowli, Hyderabad, Telangana, India'),
(5, 'Electronix Solutions', 'Plot 21, Electronic City, Bengaluru, Karnataka, India');

INSERT INTO Placement (id, organisation, profile, description, intake, minimum_grade) VALUES
(1, 1, 'Software Developer', 'Responsible for developing and maintaining software solutions.', 10, 3),
(2, 2, 'Data Analyst', 'Analyze and interpret complex datasets to drive business decisions.', 8, 3.5),
(3, 3, 'Cybersecurity Specialist', 'Ensure security and protection of company networks and systems.', 5, 3.6),
(4, 4, 'AI Engineer', 'Develop and deploy AI models and machine learning algorithms.', 7, 3.2),
(5, 5, 'Electronics Engineer', 'Design, test, and maintain electronic circuits and devices.', 6, 3.4);

INSERT INTO Student (student_id, roll_number, first_name, last_name, email, photograph_path, cgpa, total_credits, graduation_year, domain, specialisation, placement_id, password) VALUES
(1, 'CS2024001', 'Ananya', 'Sharma', 'ananya.sharma@example.com', '/images/ananya.jpg', '3.8', 120, 2024, 1, 1, 1, '$2a$10$spa6np0j73xwVjDzHvhXYuf6SxBYP2lah8NRECkH2QJnRwWY/vDJi'),
(2, 'DS2024002', 'Rahul', 'Verma', 'rahul.verma@example.com', '/images/rahul.jpg', '2.7', 115, 2024, 2, 1, 2, '$2a$10$NegMVIJf4qvXpmU3PiwhqOPy4GTM3tlaXDY/Qgw5USFwpoZTAkxki'),
(3, 'CS2023003', 'Priya', 'Kumar', 'priya.kumar@example.com', '/images/priya.jpg', '3.9', 125, 2023, 3, 2, 3, '$2a$10$w3aaK3cTmWwbNCDR4l9wgeK8XwNRzUw4CzEVpcouj7nLZPpH2qtfG'),
(4, 'AI2024004', 'Vikram', 'Singh', 'vikram.singh@example.com', '/images/vikram.jpg', '4.0', 130, 2024, 4, 2, 4, '$2a$10$FOSjER0i33arU.7h5yhf.OE2MqvKnaYO1O4xRUwRrlfw.NHe3SuWG'),
(5, 'EE2023005', 'Aditi', 'Raj', 'aditi.raj@example.com', '/images/aditi.jpg', '3.85', 118, 2023, 5, 3, 5, '$2a$10$/sfq6x7biS5stOjAelx6Uu5LQ0pm.poTPcTZblJD87ydUOJdyRQda');

INSERT INTO Specialisation (specialisation_id, code, name, description, year, credits_required) VALUES
(1, 'CSAI', 'Artificial Intelligence', 'Focuses on AI concepts including machine learning and deep learning.', 2024, 120),
(2, 'CSDV', 'Data Science', 'Covers data analysis, visualization, and big data technologies.', 2024, 110),
(3, 'CSEC', 'Cyber Security', 'Emphasizes network security, cryptography, and ethical hacking.', 2023, 100),
(4, 'CSEE', 'Embedded Systems', 'Deals with microcontrollers and embedded technology.', 2023, 90),
(5, 'CSWD', 'Web Development', 'Focuses on web technologies, front-end, and back-end development.', 2024, 95);







