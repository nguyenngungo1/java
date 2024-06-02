CREATE SEQUENCE NguoiDung_seq
START WITH 1
INCREMENT BY 1
NOCACHE;

-- Tạo bảng NguoiDung
CREATE TABLE NguoiDung (
    ID_ND VARCHAR2(10) PRIMARY KEY,
    UserRole VARCHAR2(50),
    Ten VARCHAR2(50),
    Sdt VARCHAR2(13),
    Email VARCHAR2(100),
    Password VARCHAR2(20),
    Diachi VARCHAR2(100),
    Status VARCHAR2(20)
);

-- Tạo TRIGGER để tự động tăng giá trị cho ID_ND
CREATE OR REPLACE TRIGGER trg_NguoiDung_BI
BEFORE INSERT ON NguoiDung
FOR EACH ROW
BEGIN
    SELECT NguoiDung_seq.NEXTVAL INTO :NEW.ID_ND FROM DUAL;
END;
/
CREATE SEQUENCE Loaihang_seq
START WITH 1
INCREMENT BY 1
NOCACHE;	
-- Tạo bảng Loaihang
CREATE TABLE Loaihang (
	ID_LH INT PRIMARY KEY,
	Name VARCHAR2(50)
);
-- Tạo TRIGGER để tự động tăng giá trị cho ID_LH
CREATE OR REPLACE TRIGGER trg_LoaiHang_BI
BEFORE INSERT ON LoaiHang
FOR EACH ROW
BEGIN
    SELECT Loaihang_seq.NEXTVAL INTO :NEW.ID_LH FROM DUAL;
END;
/
CREATE SEQUENCE Hanghoa_seq
START WITH 1
INCREMENT BY 1
NOCACHE;	
-- Tạo bảng Hanghoa
CREATE TABLE Hanghoa (
    ID_HH INT PRIMARY KEY,
    Name VARCHAR2(50),
    Soluong INT,
    Gia INT,
    Motasp VARCHAR2(255),
    fk_ID_LH INT,
    CONSTRAINT fk_ID_LH FOREIGN KEY (fk_ID_LH) REFERENCES Loaihang(ID_LH)
);
-- Tạo TRIGGER để tự động tăng giá trị cho ID_HH
CREATE OR REPLACE TRIGGER trg_HangHoa_BI
BEFORE INSERT ON Hanghoa
FOR EACH ROW
BEGIN
    SELECT Hanghoa_seq.NEXTVAL INTO :NEW.ID_HH FROM DUAL;
END;
/
CREATE SEQUENCE Khachhang_seq
START WITH 1
INCREMENT BY 1
NOCACHE;	
-- Tạo bảng Khachhang
CREATE TABLE Khachhang (
    ID_KH INT PRIMARY KEY,
    Tenkh VARCHAR2(50),
    Sdt VARCHAR2(13),
    Email VARCHAR2(100)
);


-- Tạo TRIGGER để tự động tăng giá trị cho ID_KH
CREATE OR REPLACE TRIGGER trg_KhachHang_BI
BEFORE INSERT ON Khachhang
FOR EACH ROW
BEGIN
    SELECT KhachHang_seq.NEXTVAL INTO :NEW.ID_KH FROM DUAL;
END;
/
CREATE SEQUENCE Hoadon_seq
START WITH 1
INCREMENT BY 1
NOCACHE;	
-- Tạo bảng Hoadon
CREATE TABLE Hoadon (
    ID_HD INT PRIMARY KEY,
    MaHD VARCHAR2(50),
    Fk_Makh INT,
    CONSTRAINT fk_Makh FOREIGN KEY (fk_Makh) REFERENCES Khachhang (ID_KH),
    NgayHD VARCHAR2(20),
    Tongtien int
);
-- Tạo TRIGGER để tự động tăng giá trị cho ID_HD
CREATE OR REPLACE TRIGGER trg_Hoadon_BI
BEFORE INSERT ON Hoadon
FOR EACH ROW
BEGIN
    SELECT Hoadon_seq.NEXTVAL INTO :NEW.ID_HD FROM DUAL;
END;
/
