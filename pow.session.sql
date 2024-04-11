

CREATE TABLE Patient (
    id INT PRIMARY KEY,
    current_nurse_id INT,
    FOREIGN KEY (current_nurse_id) REFERENCES Nurse(id)
);


