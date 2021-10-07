

drop  database bpl61; 

use bpl61;



insert into quyen
values
(1,'ROLE_ADMIN'),
(2,'ROLE_USER'),
(3,'ROLE_SHOP');

insert into tai_khoan
values
('khoatran','active','12345',1),
('luanvo','active','12345',1),
('thangnguyen','active','$2a$12$BH/YFfwpDjQSKbFyepedKOcMEwsn8rEITDjahrHmbq52T912yp2ma',1),
('quynhnhu','active','$2a$12$BH/YFfwpDjQSKbFyepedKOcMEwsn8rEITDjahrHmbq52T912yp2ma',1),
('phuocmai','active','12345',1),
('nganguyen','active','$2a$12$BH/YFfwpDjQSKbFyepedKOcMEwsn8rEITDjahrHmbq52T912yp2ma',1),
('quocnha','active','12345',1),
('khoa06','blocked','12345',0),
('luan17','blocked','12345',0),
('thang9','active','12345',0),
('nhu172','blocked','12345',0),
('phuoc8','active','12345',0),
('nha123','blocked','12345',0),
('quynh1','active','12345',0),
('thangleader','active','12345',1);

insert into taikhoan_quyen
values
('thangnguyen',2),
('khoatran',2),
('luanvo',2),
('quynhnhu',1),
('phuocmai',2),
('nganguyen',3),
('quocnha',2),
('khoa06',2),
('luan17',2),
('thang9',2),
('nhu172',2),
('phuoc8',2),
('nha123',3),
('quynh1',3),
('thangleader',3);


insert into nguoi_dung
values
(1,'201947698','80 Hoàn Diệu','tranquocnha@gmail.com',1,'2000-08-08','0918484010','Trần Quốc Nhã','quocnha'),
(2,'200041254','120 Nguyễn Văn Cừ','thangnguyen@gmail.com',1,'2000-12-12','0770341234','thanh nguyen','thangnguyen'),
(3,'201855331','120 Ngô Quyền','khoantran@gmail.com',1,'2000-08-02','0775552134','trần khoa','khoatran'),
(4,'201713453','120 Bạch Đằng','luanvo@gmail.com',1,'2000-05-02','0911443312','luân võ','luanvo'),
(5,'201544348','120 Nguyễn Lương Bằng','quynhnhuctcn@gmail.com',0,'1999-11-18','0935983010','như quỳnh','quynhnhu'),
(6,'201612378','180 Điện Biên Phủ','phuocmai@gmail.com',1,'2000-12-20','0935125501','mai phước','phuocmai'),
(7,'201612668','23 Hà Văn Tính','nganguyen@gmail.com',0,'1998-12-20','0935883391','nguyên nga','nganguyen'),
(8,'201023331','75 Ngô Quyền','khoa06@gmail.com',1,'2000-08-02','0775552134','trần khoa','khoa06'),
(9,'201848690','12 Võ Thị Sáu','luan17@gmail.com',1,'2000-05-12','0911443312','Thành luân','luan17'),
(10,'201855331','23 Ngô Quyền','thang9@gmail.com',1,'2000-01-05','0770341234','Thành Nguyễn','thang9'),
(11,'201976531','196 Bạch Đằng','nhu172@gmail.com',0,'1999-11-18','0935983010','Như Quỳnh','nhu172'),
(12,'201612378','180 Điện Biên Phủ','phuoc8@gmail.com',1,'2000-12-20','0935125501','Mai Phước','phuoc8'),
(13,'201947698','11 Điện Biển Phủ','nha123@gmail.com',1,'2000-08-08','0918484010','Trần Quốc Nhã','nha123'),
(14,'201544348','80 Hoàn Diệu','quynh1@gmail.com',0,'1999-11-18','0935983010','Như Quỳnh','quynh1'),
(15,'201711253','80 Võ Văn Kiệt','thangleader@gmail.com',1,'2000-12-18','0935983010','Thành Nguyễn','thangleader');


INSERT INTO  danh_muc (ma_danh_muc,ten_danh_muc) VALUES
(1,"Thời Trang"),
(2,"Sách"),
(3,"Giày");



INSERT INTO san_pham(ma_san_pham, gia_khoi_diem, gio_bat_dau, gio_ket_thuc, hinh, mo_ta, muc_gia, ngay_bat_dau, ngay_dang_ki, ngay_ket_thuc, so_luong, ten_san_pham, tinh_trang, ma_danh_muc, tai_khoan) VALUES
('1', '312000', '13:59:00', '17:59:00', '1.jpg', 'Sản phẩm váy suông trơn bassic, iteam không thể thiếu trong tủ đồ của mọi cô gái. Với chất vải mềm mịn, thoáng mát, lên form cực chuẩn với đường may cẩn thận, chăm chút từng chi tiết chắc chắn sẽ làm bạn yêu từ cái nhìn đầu tiên./ Mẫu váy thích hợp cho nàng đi chơi, đi làm hay đi du lịch đều oke nha. Chúng tớ hi vọng bạn sẽ trông xinh xắn, ngọt ngào hơn khi diện em váy này của nhà chúng tớ <3/Thông tin sản phẩm: Váy trơn bassic dáng suông dài/size: freesize/Màu sắc: Trắng', '10000', '2021-09-11', '2021-09-07', '2021-10-05', '50', 'Váy trơn Basic dáng xuông dài','Đã duyệt', '1', 'khoatran'),
('2', '260000', '11:59:00', '03:40:00', '2.jpg','Áo kiểu cổ bèo shop chất vải ren free size, Theo xu hướng hiện đại, trẻ trung và không kém phần năng động gửi đến các bạn những Outfit đặc biệt nhất!.Sản phẩm áo kiểu cổ bèo chất vải ren, một chiếc áo vô cùng dịu dàng và xinh xắn./ Chất liệu vải mềm mịn thoáng mát, thích hợp với thời tiết mùa hè này. /size: freesize/Màu sắc: Kem', '8000', '2021-09-12', '2021-09-10', '2021-09-28', '30', 'ÁO KIỂU CỔ BÈO', 'Đã duyệt', '1','thangnguyen'),
('3', '120000', '09:59:00', '05:27:00', '3.jpg','Theo xu hướng hiện đại, trẻ trung shhop gửi đến các bạn những Outfit đặc biệt nhất! Những items luôn được đánh giá với chất lượng sản phẩm tốt, mẫu hàng đẹp và giá cả hợp lí để đem đến sự hài lòng cho khách hàng./Sản phẩm ÁO TRỄ VAI , một chiếc áo vô cùng ngọt ngào và gợi cảm. Chất liệu vải mềm mịn thoáng mát, thích hợp với thời tiết mùa hè này. Với đường may cẩn thận, tỉ mĩ chăm chút từng mũi kim, chắc chắn sản phẩm sẽ làm hài lòng mọi cô nàng./ Mẫu áo kiểu trễ vai cực dễ phối đồ, nàng chỉ cần kết hợp với một em chân váy trông bạn thật xinh xắn!/size: freesize/Màu sắc: Xanh Dương', '8000', '2021-09-11', '2021-09-02', '2021-10-02', '30', 'Áo trễ vai', 'Đã duyệt', '1', 'thangnguyen'),
('4', '320000', '06:40:00', '06:30:00', '4.jpg','Theo xu hướng hiện đại,gửi đến các bạn những Outfit đặc biệt nhất! Những items luôn được đánh giá với chất lượng sản phẩm tốt, mẫu hàng đẹp và giá cả hợp lí để đem đến sự hài lòng cho khách hàng./Sản phẩm Quần jean nữ, quần jean ống rộng lật lai chuẩn form cá tính  SHOP, item không thể thiếu trong tủ đồ của mọi cô gái. Với chất liệu jean dày dặn, co giãn 4 chiều, đường may cẩn thận, chăm chút từng chi tiết chắc chắn sẽ làm bạn yêu từ cái nhìn đầu tiên. Mẫu quần jean với thiết kế lưng cao cực kì hack dáng, thích hợp cho nàng đi chơi, đi làm đều oke. Quần jean ống suông cực kì dễ phối đồ, có thể kết hợp với áo phông, áo kiểu hay sơ mi đều oke nha ^ ^ /size: M /Màu sắc: Xanh Nhạt', '8000', '2021-09-12', '2021-09-03', '2021-09-04', '100', 'Quần jean ống rộng', 'Đã duyệt', '1','phuocmai'),
('5', '130000', '06:24:00', '07:40:00', '5.jpg','Sản phẩm ÁO KIỂU shop, một chiếc áo kiểu với họa tiết sọc kẻ siêu yêu, chi tiết phồng tay vô cùng dịu dàng và xinh xắn. Chất liệu vải mềm mịn thoáng mát, thích hợp với thời tiết mùa này. Với đường may cẩn thận, tỉ mĩ chăm chút từng mũi kim, chắc chắn sản phẩm sẽ làm hài lòng mọi cô nàng. Mẫu ÁO KIỂU SHOP cực dễ phối đồ, nàng có thể kết hợp với một em chân váy, quần jean hoặc một chiếc quần short, trông bạn thật xinh xắn <3 /size: freesize/Màu sắc: Tím', '14000', '2021-08-14', '2021-08-13', '2021-09-05', '13', 'Áo kiểu, tay phồng, sọc kẻ', 'Đã duyệt', '1','khoatran'),
('6', '150000', '05:49:00', '08:10:00', '6.jpg','Sản phẩm áo kiều tay phồng kim tuyến, một chiếc áo vô cùng dịu dàng và xinh xắn. Chất liệu vải mềm mịn thoáng mát, thích hợp với thời tiết mùa hè này. Với đường may cẩn thận, tỉ mĩ chăm chút từng mũi kim, chắc chắn sản phẩm sẽ làm hài lòng mọi cô nàng. Mẫu áo kiểu cực dễ phối đồ, nàng có thể kết hợp với một em chân váy, quần jean hay một chiếc yếm váy xinh xắn <3 /size: freesize/Màu sắc: Xanh dương', '18000', '2021-09-01', '2021-08-30', '2021-09-12', '14', 'Áo kim tuyến', 'Đã duyệt', '1','thangnguyen'),
('7', '235000', '04:59:00', '03:40:00', '7.jpg',' Theo xu hướng hiện đại, trẻ trung và không kém phần năng độnggửi đến các bạn những Outfit đặc biệt nhất! Những items tại  luôn được đánh giá với chất lượng sản phẩm tốt, mẫu hàng đẹp và giá cả hợp lí để đem đến sự hài lòng cho khách hàng./Sản phẩm váy hoa nhí iteam không thể thiếu trong tủ đồ của mọi cô gái. Với chất vải mềm mịn, thoáng mát, lên form cực chuẩn với đường may cẩn thận, chăm chút từng chi tiết chắc chắn sẽ làm bạn yêu từ cái nhìn đầu tiên. Mẫu váy thích hợp cho nàng đi chơi, du lịch hay đi làm đều oke nha. Chúng tớ hi vọng bạn sẽ trông xinh xắn, ngọt ngào hơn khi diện em váy này của nhà Xonxen chúng tớ <3/size: freesize/Màu sắc: Kem', '50000', '2021-08-04', '2021-08-03', '2021-10-03', '55', 'Váy hoa nhí','Đã duyệt', '1','phuocmai'),
('8', '215000', '07:29:00', '02:39:00', '8.jpg','Theo xu hướng hiện đại, trẻ trung và không kém phần năng động  gửi đến các bạn những Outfit đặc biệt nhất! Những items tại luôn được đánh giá với chất lượng sản phẩm tốt, mẫu hàng đẹp và giá cả hợp lí để đem đến sự hài lòng cho khách hàng./Sản phẩm chân váy suông dáng dài, một siêu phẩm cực kì năng động và cá tính. Chất liệu vải dầy dặn, lên form cực chuẩn, với đường may cẩn thận, chăm chút từng chi tiết chắc chắn sẽ làm bạn yêu từ cái nhìn đầu tiên. Chân váy với thiết kế lưng cao cực kì hack dáng, bảo đảm không làm nàng thất vọng. Siêu phẩm cực kì dễ phối đồ, nàng có thể kết hợp với áo thun, áo kiểu... /size: freesize/Màu sắc: Kem', '40000', '2021-07-29', '2021-07-26', '2021-10-31', '60', 'Chân váy thun ', 'Đã duyệt', '1','phuocmai'),
('9', '175000', '15:30:00', '07:39:00', '9.jpg',' gửi đến các bạn những Outfit đặc biệt nhất! Những items luôn được đánh giá với chất lượng sản phẩm tốt, mẫu hàng đẹp và giá cả hợp lí để đem đến sự hài lòng cho khách hàng./Sản phẩm yếm váy, iteam không thể thiếu trong tủ đồ của mọi cô gái. Với chất vải mềm mịn, thoáng mát, lên form cực chuẩn với đường may cẩn thận, chăm chút từng chi tiết chắc chắn sẽ làm bạn yêu từ cái nhìn đầu tiên. Mẫu váy thích hợp cho nàng đi chơi, dạo phố hay du lịch đều oke nha. Chúng tớ hi vọng bạn sẽ trông xinh xắn, ngọt ngào hơn khi diện em yếm váy này của nhà Xonxen chúng tớ <3/size: freesize/Màu sắc: Kem', '23000', '2021-09-14', '2021-09-13', '2021-10-01', '20', 'Yến kakiii dáng rộng', 'Đã duyệt', '1','phuocmai'),
('10','200000', '02:50:00', '03:59:00', '10.jpg','Theo xu hướng hiện đại,trẻ trung và không kém phần năng động gửi đến các bạn những Outfit đặc biệt nhất! Những items tại shop luôn được đánh giá với chất lượng sản phẩm tốt, mẫu hàng đẹp và giá cả hợp lí để đem đến sự hài lòng cho khách hàng./Sản phẩm váy hoa nhí, iteam không thể thiếu trong tủ đồ của mọi cô gái. Với chất vải mềm mịn, thoáng mát, lên form cực chuẩn với đường may cẩn thận, chăm chút từng chi tiết chắc chắn sẽ làm bạn yêu từ cái nhìn đầu tiên. Mẫu váy thích hợp cho nàng đi chơi, đi làm hay đi du lịch đều oke nha. Chúng tớ hi vọng bạn sẽ trông xinh xắn, ngọt ngào hơn khi diện em váy này của nhà Xonxen chúng tớ <3/size: freesize/Màu sắc: Kem', '58000', '2021-08-12', '2021-08-14', '2021-10-30', '40', 'Váy hoa nhí chất mịn ', 'Đã duyệt', '2','phuocmai'),
('11', '53000', '04:10:00', '07:12:00', '11.jpg','TỰ GIÁC BAO NHIÊU, TỰ DO BẤY NHIÊU/Theo bạn thì, thế nào là tự do?/Là có thể nằm ườn trên ghế sô pha xem phim, ôm điện thoại lướt mạng cả ngày?/Hay là được ăn thoải mái các thể loại đồ ăn nhanh, trà sữa… bất chấp ảnh hưởng của chúng tới sức khỏe?/Trời mưa thì tự cho phép bản thân nghỉ làm, thích đồ gì thì mua luôn đồ nấy, dù cho chưa đến cuối tháng đã hết sạch tiền?/Những điều trên trông thì có vẻ thoải mái thật đấy, nhưng dần dần bạn sẽ nhận ra cuộc sống của mình ngày càng mơ hồ, sợ sệt, bởi bạn không có SỰ LỰA CHỌN. Lãng phí thời gian, tiền bạc vô ích chỉ càng tạo nên sự chậm chạp trong tư duy, bệnh tật cho cơ thể và sự cằn cỗi trong tâm hồn mà thôi./KÝ LUẬT TỰ GIÁC, cuốn sách đã thành công chỉnh đốn lối sống của hàng triệu người trẻ Trung Quốc, sẽ giúp bạn hiểu: “Tự do” thực sự không phải là tùy theo ý thích, mà là tự mình làm chủ.', '23000', '2021-09-06', '2021-09-05', '2021-11-30', '20', 'Kỷ Luật Tự Giác', 'Chưa duyệt', '2','phuocmai'),
('12', '60000', '04:40:00', '08:38:00', '12.jpg','“Muôn kiếp nhân sinh” là tác phẩm do Giáo sư John Vũ - Nguyên Phong viết từ năm 2017 và hoàn tất đầu năm 2020 ghi lại những câu chuyện, trải nghiệm tiền kiếp kỳ lạ từ nhiều kiếp sống của người bạn tâm giao lâu năm, ông Thomas – một nhà kinh doanh tài chính nổi tiếng ở New York. Những câu chuyện chưa từng tiết lộ này sẽ giúp mọi người trên thế giới chiêm nghiệm, khám phá các quy luật về luật Nhân quả và Luân hồi của vũ trụ giữa lúc trái đất đang gặp nhiều tai ương, biến động, khủng hoảng từng ngày./“Muôn kiếp nhân sinh” là một bức tranh lớn với vô vàn mảnh ghép cuộc đời, là một cuốn phim đồ sộ, sống động về những kiếp sống huyền bí, trải dài từ nền văn minh Atlantis hùng mạnh đến vương quốc Ai Cập cổ đại của các Pharaoh quyền uy, đến Hợp Chủng Quốc Hoa Kỳ ngày nay.', '33000', '2021-02-08', '2021-02-07', '2021-09-30', '40', 'Muôn Kiếp Nhân Sinh',   'Đã duyệt', '2','phuocmai'),
('13', '220000', '15:50:00', '05:59:00', '13.jpg','Chủ Nghĩa Khắc kỷ (Stoicism) là một trường phái triết học cổ đại được sáng lập bởi nhà triết học Zeno xứ Citium vào đầu thế kỷ thứ 3 Trước Công Nguyên. Sau đó trường phái này được kết thừa bởi ba trụ cột thời La Mã là Seneca, hoàng đế Marcus Aurelius và Epictetus./Chủ Nghĩa Khắc kỷ được khai sinh với sứ mệnh trui rèn bản lĩnh và tinh thần của con người trước những áp lực và khổ đau trong cuộc sống. Trong một thế giới hiện đại chênh vênh và đầy khủng hoảng: thất nghiệp, dịch bệnh, nỗi đau, cái chết, Chủ nghĩa Khắc kỷ sẽ giúp bạn vững vàng đối mặt và tìm được sự bình thản trong tâm trí (the tranquillity of mind), để không bị "cuốn theo chiều gió" trước vô vàn những cám dỗ và khó khăn của đời sống thường ngày. ', '53000', '2021-09-16', '2021-09-05', '2021-10-30', '40', 'Seneca: Những Bức Thư Đạo Đức ',  'Đã duyệt', '2','phuocmai');
INSERT INTO san_pham(ma_san_pham, gia_khoi_diem, gio_bat_dau, gio_ket_thuc, hinh, mo_ta, muc_gia, ngay_bat_dau, ngay_dang_ki, ngay_ket_thuc, so_luong, ten_san_pham, tinh_trang, ma_danh_muc, tai_khoan) VALUES
('14', '83000', '22:20:00', '08:38:00', '14.jpg','"Người Trong Muôn Nghề: Ngành Kinh Tế Có Gì?" tập hợp 21 bài viết chứa đựng những chia sẻ “thật và chất” của các tác giả - những người trực tiếp hoạt động trong đa dạng các vị trí liên quan đến khối Kinh tế. Họ ở đủ mọi độ tuổi, vị trí công việc, địa lý, giới tính: Từ những người vào nghề vài năm tới các đàn anh 30 năm trong nghề; Từ người học tập tại nước ngoài cho đến các bạn tốt nghiệp trong nước; Từ người làm giảng viên, nghiên cứu cho đến các doanh nhân lăn lộn thương trường; Từ chuyên gia đầu ngành Kinh tế của Việt Nam cho đến những người có bộ óc “sừng sỏ” trong đầu tư, kinh doanh ở nước ngoài,', '5300', '2021-09-18', '2021-09-14', '2021-10-09', '40', ' Người Trong Muôn Nghề',  'Đã duyệt', '2','phuocmai');
INSERT INTO san_pham(ma_san_pham, gia_khoi_diem, gio_bat_dau, gio_ket_thuc, hinh, mo_ta, muc_gia, ngay_bat_dau, ngay_dang_ki, ngay_ket_thuc, so_luong, ten_san_pham, tinh_trang, ma_danh_muc, tai_khoan) VALUES
('15', '84000', '01:45:00', '12:39:00', '15.jpg','Hầu hết những người trẻ đều đã từng hoặc đang trải qua cảm giác không biết mình thuộc về đâu. Khó khăn lớn nhất có lẽ không phải là kiếm được việc, mà là chọn được một nghề  môi trường làm việc khác nhau. ', '12000', '2021-10-20', '2021-10-18', '2021-10-10', '50', 'Tủ sách hướng nghiệp', 'Chưa duyệt', '2','nganguyen');

INSERT INTO san_pham(ma_san_pham, gia_khoi_diem, gio_bat_dau, gio_ket_thuc, hinh, mo_ta, muc_gia, ngay_bat_dau, ngay_dang_ki, ngay_ket_thuc, so_luong, ten_san_pham, tinh_trang, ma_danh_muc, tai_khoan) VALUES
('16', '960000', '05:30:00', '17:37:00', '16.jpg','Hành Trình Về Phương Đông, một trong những tác phẩm đương đại hay và độc đáo nhất về văn hóa phương Đông vừa tái ngộ bơn, Hoa trôi trên sóng nước, Minh triết trong đời sống, Đường mây qua xứ tuyết…/Sản phẩm bán chạy nhất	Top 100 sản phẩm Tôn Giáo bán chạy của tháng/Hành Trình Về Phương Đông, một trong những tác phẩm đương đại hay và độc đáo nhất về văn hóa phương Đông vừa tái ngộ bạn đọc trong một diện mạo hoàn toàn mới, sang trọng và ấn tượng. Đây là ấn bản có lượng phát hành ấn tượng, hơn 40.000 bản tại Việt Nam chỉ trong vài năm trở lại đây./Hành Trình Về Phương Đông kể về những trải nghiệm của một đoàn khoa học gồm các chuyên gia hàng đầu của Hội Khoa Học Hoàng Gia Anh được cử sang Ấn Độ nghiên cứu về huyền học và những khả năng siêu nhiên của con người. Suốt hai năm trời rong ruổi khắp các đền chùa Ấn Độ, diện kiến nhiều pháp thuật, nhiều cảnh mê tín dị đoan, thậm chí lừa đào… của nhiều pháp sư thông thái sống ẩn dật ở thị trấn hay trênnh công" và "Quản lý tài chính cá nhân".', '7000', '2021-09-27', '2021-09-26', '2021-10-19', '40', 'Cảm Xúc Là Kẻ Thù Số Một Của Thành Công',  'Không duyệt', '2','quynhnhu'),
('19', '120000', '15:31:00', '03:29:00', '19.jpg','Sau thành công của Tuổi Trẻ Đáng Giá Bao Nhiêu, tác giả lên đường du học và nhìn lại quá trình học tập của mình từ khi ra trường cho đến hôm nay. Trên Hành Trình Tự Học là tập hợp những bài viết liên quan đến việc học./Sách chia làm bốn phần chính: Học Để Biết, Học Để Làm, Học Để Chuyển Mình, Học Để Chung Sống. Mỗi phần đều được viết dựa trên kinh nghiệm của tác giả và từ những câu chuyện của những người bạn mà tác giả có dịp gặp gỡ, chia sẻ. Tác giả cũng xem xét về các khía cạnh khác nhau của sự học: cách học trực tuyến, học từ trường, từ gia đình… Song song đó là nhận định tổng quan về giá trị chung của việc học.', '8000', '2021-09-05', '2021-09-03', '2021-10-17', '60', 'Trên Hành Trình Tự Học', 'Đã duyệt', '2','phuocmai'),
('20', '900000', '14:30:00', '07:49:00', '20.jpg','Lợi ích khi mua Giày Balenciaga Track 3.0 xanh cam replica 1:1 tại Shop giày Replica™/Cam kết chỉ bán giày chuẩn rep 1:1, chất lượng đảm bảo tuyệt đối./Giá cạnh tranh nhất trên thị trường, chất lượng sản phẩm đúng với giá trị tiền bỏ ra./Khách hàng được kiểm tra, đi thử trước khi nhận hàng./size: 43', '10000', '2021-07-23', '2021-07-22', '2021-08-30', '40', 'Giày Balenciaga Track 3.0 xanh cam', 'Đã duyệt', '3','khoatran'),
('21', '960000', '18:59:00', '08:37:00', '21.jpg','Nike Jordan 1 vẫn đang thể hiện tính thời trang mạnh mẽ của mình thông qua từng mẫu sneakers được đưa lên kệ. Và một trong những đôi Jordan 1 cao cổ (high) được đón chờ nhất trong năm 2021 chính là Nike Air Jordan 1 Retro High University Blue, mẫu sneakers với nét đặc trưng huyền thoại nhưng mang diện mạo tươi mới./Kể từ khi được tiết lộ, đôi Jordan 1 High OG University Blue đã thu hút mọi sneakerheads với sự hòa hợp mọi chi tiết trên đôi giày một cách hoàn hảo. Mẫu sneakers này được ra mắt trong Bộ sưu tập Mùa Xuân 2021 của Jordan. /size: 45', '34000', '2021-06-15', '2021-06-14', '2021-10-30', '60', 'Nike Air Jordan 1 Retro High ',   'Đã duyệt', '3','quynhnhu'),
('22', '2260000', '11:25:00', '12:36:00', '22.jpg','Lợi ích khi mua Giày Nike Air Max 97 MSCHF x INRI Jesus replica 1:1 tại Shop giày Replica™/Cam kết chỉ bán giày chuẩn rep 1:1, chất lượng đảm bảo tuyệt đối./Giá cạnh tranh nhất trên thị trường, chất lượng sản phẩm đúng với giá trị tiền bỏ ra./Khách hàng được kiểm tra, đi thử trước khi nhận hàng./size: 41', '53000', '2021-10-20', '2021-10-19', '2021-11-30', '80', 'Giày Nike Air Max 97 MSCHF x INRI Jesus', 'Đã duyệt', '3','khoatran'),
('23', '1260000', '02:16:00', '15:09:00', '23.jpg',' Chất liệu: TBC Kiểu dáng giày thời trang Thiết kế lấy cảm hứng từ hiệp hội bóng chày MLB Cộng hưởng cùng chi tiết chữ sắc nét Lớp lót êm ái, nâng dáng bước chân Gam màu hiện đại dễ dàng phối với nhiều trang phục và phụ kiện Xuất xứ thương hiệu: Hàn quốc/Giày Big Ball Chunky Mono LT New York Yankees/Chất liệu: TBC/Kiểu dáng giày sneaker đế cao thời trang/Thiết kế lấy cảm hứng từ hiệp hội bóng chày MLB/Cộng hưởng cùng chi tiết chữ sắc nét/Lớp lót êm ái, nâng dáng bước chân/Gam màu hiện đại dễ dàng phối với nhiều trang phục và phụ kiện/Xuất xứ thương hiệu: Hàn quốc/size: 42', '13000', '2021-10-14', '2021-10-13', '2021-11-13', '50', 'MLB Bigball Chunky ', 'Đã duyệt', '3','nha123'),
('24', '860000', '05:14:00', '17:19:00', '24.jpg',' Chúng tôi đã bán giày từ năm 2018 đến nay, các sản phẩm của chúng tôi đều được nhập trực tiếp từ Trung Quốc và đều là chất lượng tốt do chúng tôi lựa chọn sản phẩm kỹ càng./ Ảnh sản phẩm đều là ảnh thật chính chủ do chúng tôi tự chụp./ Sản phẩm có đầy đủ box, giấy gói, phụ kiện đi kèm (nếu có) và đều được chúng tôi kiểm tra trước khi gửi hàng/size: freesize/Màu sắc: Kem', '43000', '2021-06-24', '2021-04-23', '2021-12-12', '30', 'Nike Air Jordan 1 Retro Low OG SP Travis Scott Like Auth',   'Đã duyệt', '3','nha123'),
('25', '780000', '02:30:00', '18:29:00', '25.jpg','Air Jordan 1 Retro Low được phát hành lần đầu tiên vào năm 2004. Bao gồm màu xanh hải quân trắng, đen và nửa đêm này. Tương tự như bản phát hành Retro + từ năm 2001, đôi này có phần trên bằng da lộn màu trắng với các điểm nhấn màu xanh nước biển và đen nubuck được hoàn thiện bằng thương hiệu bạc kim loại trên lưỡi gà. Sự khác biệt chính giữa hai bản phát hành là điểm nhấn màu đen ở âm thấp và điểm nhấn màu bạc ở âm trung / cao. Hình dạng của chúng cũng khá độc đáo, vì chúng không phải là bản dựng hoàn toàn giống với AJ 1 Low ban đầu từ ’85-86. Phiên bản phát hành lại này như 1 lần hoài cổ mà Nike muốn đem lại sự trải nghiệm cho người dùng. /size: 45', '73000', '2021-06-06', '2021-06-05', '2021-09-05', '103', 'Nike Air Jordan ', 'Đã duyệt', '3', 'nha123'),
('26', '930000', '05:20:00', '10:39:00', '26.jpg','Chất liệu: TBC/Kiểu dáng giày sneaker đế cao thời trang/Thiết kế lấy cảm hứng từ hiệp hội bóng chày MLB/Cộng hưởng cùng chi tiết chữ sắc nét/Lớp lót êm ái, nâng dáng bước chân/Gam màu hiện đại dễ dàng phối với nhiều trang phục và phụ kiện/Xuất xứ thương hiệu: Hàn quốc/size: 37', '93000', '2021-09-06', '2021-09-03', '2021-12-04', '40', 'Giày Sneaker ','Đã duyệt', '3', 'khoatran'),
('27', '1200000', '06:40:00', '04:49:00', '27.jpg',' Mua giày Gucci Wmns Rhyton "Mouth Print" 552093 A9L00 9522chính hãng 100% có sẵn tại Authentic Shoes. Giao hàng miễn phí trong 1 ngày. Cam kết đền tiền X5 nếu phát hiện Fake. Đổi trả miễn phí size. FREE vệ sinh giày trọn đời. MUA NGAY!/size: 39', '100000', '2021-05-04', '2021-05-03', '2021-10-30', '50', 'Giày Gucci Wmns Rhyton ', 'Đã duyệt', '3', 'quynhnhu'),
('28', '2450000', '07:30:00', '13:59:00', '28.jpg','Mua giày MLB PlayBall Mule Mono Denim New York Yankees 32SHSD111-50N chính hãng 100% có sẵn tại Authentic Shoes. Giao hàng miễn phí trong 1 ngày. Cam kết đền tiền X5 nếu phát hiện Fake. Đổi trả miễn phí size. FREE vệ sinh trọn đời. MUA NGAY! /size: 43', '4000', '2021-11-14', '2021-11-12', '2022-01-30', '70', 'MLB PlayBall ','Đã duyệt', '3', 'khoatran'),
('29', '4950000', '08:23:00', '14:29:00', '29.jpg',' Cảm ơn các bạn đã đến với chúng tôi. Sau khi nhận giày xong nếu có vấn đề nào bạn chưa vừa lòng làm ơn hãy liên hệ ngay với chúng tôi để được hỗ trợ và giải quyết .các bạn hãy vui lòng dành chút thời gian đánh giá sản phẩm để shop lấy động lực phục vụ các bạn tốt hơn nhé !!/CAM KẾT CỦA SHOP :/Bán đúng chất lượng về sản  phẩm như mô tả /Chuyển đúng hàng , đúng mẫu mã và size giày /Màu sắc đúng với đơn đặt hàng /Trả hàng hoàn tiền 100% nếu giày không đúng với mô tả/size: 41', '13000', '2021-06-15', '2021-05-14', '2022-01-30', '100', 'Giày Alexander đen Rep 1:1', 'Đã duyệt', '3', 'khoatran'),
('30', '2860000', '10:30:00', '18:39:00', '30.jpg','Lợi ích khi mua Giày Adidas Yeezy 350 V2 True form replica 1:1 tại Shop giày Replica™/Cam kết chỉ bán giày chuẩn rep 1:1, chất lượng đảm bảo tuyệt đối./Giá cạnh tranh nhất trên thị trường, chất lượng sản phẩm đúng với giá trị tiền bỏ ra./Khách hàng được kiểm tra, đi thử trước khi nhận hàng. /size: 45', '12000', '2021-09-18', '2021-09-13', '2022-02-26', '120', 'Giày Adidas Yeezy','Đã duyệt', '3', 'khoatran');


insert into danh_muc(ma_danh_muc, ten_danh_muc)
values (4, 'Phương tiện'),
(5, 'Máy tính và Laptop'),
(6, 'Đồng hồ');

insert into san_pham(ma_san_pham, gia_khoi_diem, gio_bat_dau, gio_ket_thuc, hinh, mo_ta, muc_gia, ngay_bat_dau, ngay_dang_ki, ngay_ket_thuc, so_luong, ten_san_pham, tinh_trang, ma_danh_muc, tai_khoan)
values
(31, 38000000, '14:59:00', '15:59:00', 'img_31.jpg', 'Hệ thống khóa thông minh (Honda Smart Key) là công nghệ đột phá mới lần đầu tiên được trang bị trên xe AirBlade 2019 ở 3 phiên bản cao cấp, từ tính và phiên bản đặc biệt kỷ niệm 10 năm tương tự như dòng Honda LEAD 2019 mới ra trước đó, thay cho hệ thống khóa thông thường vẫn được áp dụng cho phiên bản tiêu chuẩn. Honda Smart Key có thiết kế sang trọng tích hợp nhiều tính năng mở/tắt thông qua kết nối không dây từ thiết bị điều khiển Fob đến bộ vi xử lý trung tâm ECU của hệ thống khóa thông minh vga xe AB 2019. Ngăn chặn, tối ưu khả năng chống trộm, hệ thống cũng xác định vị trí xe giống ôtô mang lại tiện ích cao cấp cho người sử dụng. (Chỉ có trên phiên bản cao cấp và phiên bản sơn từ tính cao cấp và đặc biệt kỷ niệm 10 năm)./Hộc đựng đồ lớn: với dung tích lớn cho phép bỏ được 1 mũ bảo hiểm cả đầu hoặc 2 mũ nửa đầu cùng nhiều vật dụng cá nhân khác. Bên cạnh đó vách ngăn thông minh có thể chia hộc đựng đồ thành nhiều ngăn khác nhau giúp người dùng có dễ dàng quản lý vật dụng của mình./Hệ thống phanh kết hợp (Combi Brake): Hệ thống phanh kết hợp giúp phân bổ lực phanh giữa bánh trước và bánh sau mà chỉ cần dùng phanh sau, rất dễ sử dụng./Động cơ: Với thiết kế nhỏ gọn, esp thế hệ thứ 2 động cơ 125cc 4 thì xi lanh đơn, làm mát bằng dung dịch và tích hợp những công nghệ tiên tiến nhất nhờ đó Air Blade 2019 tiết kiệm được hơn 4% nhiên liệu so với Air Blade đời 2015, 2014./Bộ đề tích hợp ACG: Xe khởi động cực kỳ êm ái nhờ tích hợp hệ thống khởi động và máy phát điện, giảm tính ma sát tối đa, tiết kiệm nhiên liệu và tái khởi động dễ dàng./Màu sắc: màu xanh.', 100000, '2021-09-15', '2021-09-07', '2021-09-30', 1, 'Xe Honda Air Blade', 'Không duyệt', 4,'nganguyen'),
(32, 250000000, '14:30:00', '17:00:00', 'img_32.jpg', '- Xe được thiết kế khoa học, không gian xe rộng thoáng, vận hành êm ái, chạy cao tốc bao êm, tăng tốc vượt trội, đi cực lành không hỏng vặt./- Trang bị tính năng an toàn với túi khí phanh ABS, DVD, camera lùi./- Thân vỏ cực đẹp, sơn si còn mới, máy gầm chắc, chạy êm không tiếng ồn, điều hoà mát cực sâu./- Ghế ngồi trên xe vẫn còn êm ái, chưa bong chóc, hao mòn sờn bạc./- Hệ thống điều hòa làm mát lạnh nhanh và sâu trong toàn khoang xe./- Có trang bị thêm các hộc ngăn đựng đồ tiện lợi, kính chỉnh điện, gương chiếu hậu chống chói./- Đầy đủ giấy tờ, đăng kí đăng kiểm, đi rất giữ gìn, bảo dưỡng thường xuyên nên động cơ hoạt động cực kì ổn định, không giật cục, không chết máy./Màu sắc: màu bạc.', '200000', '2021-09-13', '2021-09-06', '2021-09-29', 1, 'Xe Ford Fiesta', 'Không duyệt', 4, 'nganguyen'),
(33, 600000000, '08:30:00', '09:30:00', 'img_33.jpg', 'Khách hàng sẽ có 03 lựa chọn động cơ dầu./- Đầu tiên là loại tăng áp 2.2L (160 mã lực/385 Nm) đi kèm hộp số tự động hoặc số sàn 6 cấp./- Thứ 2 là loại tăng áp đơn 2.0L (180 mã lực/ 420 Nm) và hộp số tự động 10 cấp./- Thứ 3 là động cơ tăng áp đôi 2.0L (213 mã lực/ 500 Nm), hộp số tự động 10 cấp. /Màu sắc: màu cam.', '250000', '2021-09-14', '2021-09-06', '2021-10-27', 1, 'XE FORD RANGER',   'Đã duyệt', 4, 'nha123'),
(34, 600000000, '12:00:00', '15:00:00', 'img_34.jpg', 'Tất cả các phiên bản xe đều sử dụng chung khối động cơ dầu 2.5L sản sinh công suất 180 mã lực tại 3.600 vòng/phút và mô-men xoắn 440 Nm tại 2.000 vòng/phút. Hộp số sàn hoặc tự động 6 cấp. /Màu sắc: màu đỏ.', '250000', '2021-09-14', '2021-09-06', '2021-10-27', 1, 'XE CHEVROLET COLORADO ', 'Đã duyệt', 4, 'quynhnhu'),
(35, 38000000, '08:00:00', '11:30:00', 'img_35.jpg', 'Mẫu xe máy Honda mới nhất - Vario 150 đã ra mắt thị trường Indonesia hồi tháng trước./Thiết kế góc cạnh sắc xảo tạo ra vẻ hầm hố và thể thao cho chiếc xe máy Honda mới - Vario 150./Động cơ trên mẫu xe máy Honda mới nhất sử dụng công nghệ eSP tiên tiến./Màu sắc: màu đen.', '100000', '2021-09-12', '2021-09-05', '2021-10-28', 1, 'Xe tay ga Honda  150 eSP ', 'Đã duyệt', 4, 'quynhnhu'),
(36, 28000000, '09:30:00', '11:30:00', 'img_36.jpg', 'Màu sắc: màu đen, đỏ.', '50000', '2021-09-11', '2021-09-07', '2021-09-26', 2, 'Xe máy Suzuki GD110HU',  'Chưa duyệt', 4, 'quynhnhu'),
(37, 990000, '12:00:00', '12:30:00', 'img_37.jpg', 'Thương hiệu: Maruishi/Tải trọng tối đa: 11,64kg/Trọng lượng: 11,64kg/Màu sắc: màu xanh.', '10000', '2021-09-19', '2021-09-15', '2021-09-30', 7, 'Xe đạp trẻ em Nhật Dually',  'Chưa duyệt', 4, 'khoatran'),
(38, 1000000, '12:00:00', '12:30:00', 'img_38.jpg', 'THÔNG SỐ KỸ THUẬT/Cỡ khung: 24 inches/Khung sườn: Thép chịu lực cao cấp/Phuộc: Thép chịu lực cao cấp/Tay phanh: Nhôm/Phanh: Nhôm/Xích: 92 mắt/Vành: 24" * 1.75/Lốp: Cao su, cỡ 24" * 1.75/Cọc yên: Nhôm/Yên: Giả da/Bàn đạp: Nhựa/Xuất xứ: Việt Nam/Hãng sản xuất: Thống Nhất/Cỡ bánh: 24 inches/Kích thước: 1670 x 590 x 1020 cm/Trọng lượng: 15 kg/Màu sắc: màu hồng.', '10000', '2021-09-19', '2021-09-17', '2021-10-29', 5, 'Xe đạp Thống nhất nữ LD 24-02',  'Đã duyệt', 4, 'nganguyen'),
(39, 36500000, '13:59:00', '16:59:00', 'img_39.jpg', '- Exciter 135cc RC Tự Động đk 2011 (Hết sản xuất)/- BSTP : 59 - C2 : 03407/- Máy móc Zin Đầu lòng chưa chạm/Siêu Êm ái ! Nổ máy ko nghe tiếng ! BAO DẮT THỢ YAMAHA TEST ĐỦ KIỂU NHA AE/Xe đúng chất zin. Ae đừng so sánh với mấy xe nát nha./- Xe mới như xe Hãng/—Yên gọt phương nam/- Phuộc sau Redleo/- Vỏ Michelin City Pro/- Cổ Titan/- NSD Did mới 100%/- Phuộc Redleo bình dầu/_Cùm NVX chế độ tắt máy/—Đèn lead siêu sáng/Sườn lốc gấp zin 100% chưa dặm tút/—Xe chuẩn chỉ 100% mua về ae chơi ngay/Màu sắc: màu đỏ.', '100000', '2021-09-20', '2021-09-16', '2021-10-01', 1, 'Xe Yamaha exci','Đã duyệt', 4, 'khoatran'),
(40, 600000, '14:59:00', '15:29:00', 'img_40.jpg', 'Thông số kỹ thuật:/Tên sản phẩm: Xe điện tự lái có điều khiển từ xa cho bé 2-10 tuổi RB-002/Kích thước: Dài rộng cao 65 x 55 x 65 cm/Tải trọng tối đa: 35kg/Tốc độ tối đa: 5km/h/Điện áp: 6.5V/4.5A/Nguồn điện: Sử dụng 1 acquy sạc điện/Hệ thống đèn led khắp xe/Bộ sản phẩm: 1 máy, 1 điều khiển từ xa, 1 dây sạc/Màu sắc: màu xanh.', '10000', '2021-09-17', '2021-09-13', '2021-10-29', 3, 'Xe điện robot tự lái',  'Đã duyệt', 4, 'nganguyen'),
(41, 100000, '09:30:00', '11:30:00', 'img_41.jpg', 'Mô tả sản phẩm/- Kiểu máy: NKB-100/- Bàn phím Bluetooth cho máy tính/- Bố cục QWERTY với các phím nóng./- Cung cấp cảm giác tuyệt vời của cảm ứng và gõ thoải mái./- Pin sạc 110mAh tích hợp, 40 giờ sử dụng liên tục./- Hỗ trợ: Andriod, iOS, Windows, Mac OS/- Kích thước: 24 x 0,5 x 15 cm./Màu sắc: màu đen.', '1000', '2021-09-15', '2021-09-08', '2021-10-27', 2, 'Bàn phím Bluetooth siêu', 'Đã duyệt', 5, 'nha123'),
(42, 5499000, '15:30:00', '16:30:00', 'img_42.jpg', 'CPU: Intel Core i5-1035G1 (1.0 GHz 3.6 GHz/6MB/4 nhân, 8 luồng) Màn hình: 15.6" (1920 x 1080), không cảm ứng RAM: 1 x 4GB Onboard DDR4 2400MHz (1 Khe cắm, Hỗ trợ tối đa 12GB) Đồ họa: Intel UHD Graphics Lưu trữ: 256GB SSD M.2 NVMe / Hệ điều hành: Windows 10 Home 64-bit Pin: 2 cell 36 Wh Pin liền/Màu sắc: màu đen.', '10000', '2021-09-11', '2021-09-07', '202110-26', 1, 'Laptop Acer Aspire A315-56-59XY',  'Chưa duyệt', 5, 'nha123'),
(43, 99000, '10:30:00', '11:00:00', 'img_43.jpg', 'Màu sắc: màu trắng.', '1000', '2021-09-15', '2021-09-13', '2021-09-30', 10, 'Giá đỡ tản nhiệt laptop, điện thoại, máy tính bảng T3 tích hợp giá đỡ điện thoại',  'Chưa duyệt', 5, 'khoatran'),
(44, 18000000, '09:30:00', '11:30:00', 'img_44.jpg', 'Chip: Intel Core i7-8565U 1.8GHz up to 4.6GHz 8MB RAM: 8GB DDR4 2400MHz Ổ cứng: 256GB SSD M.2 PCIe NVMe Chipset đồ họa: Intel UHD Graphics 620 Màn hình: 14 inch Full HD (1920 x 1080) IPS Anti-Glare Hệ điều hành: Free Dos Pin: 3 Cells 57 Whrs/Thiết kế gập 180 độ./Bộ vi xử lý Intel Core i7./Màn hình 14 inch Full HD chống chói./Công nghệ âm thanh Dolby Audio Premium./Màu sắc: màu đen.', '20000', '2021-09-22', '2021-09-17', '2021-10-29', 1, 'Laptop Lenovo ThinkPad T490s ', 'Đã duyệt', 5, 'khoatran'),
(45, 200000, '10:59:00', '14:59:00', 'img_45.jpg', 'MÔ TẢ SẢN PHẨM/Tên SP: 80-155453 My Laptop - Laptop học chữ cái Mã SP: 3417761554531 Nhà NK: Cty CP Văn Hóa và Giáo Dục Tân Việt Thành phần: Nhựa An Toàn Sản phẩm dành cho trẻ từ 1-6 tuổi./Nhà NK&PP: CT CP Văn Hóa & Giáo Dục Tân Việt./Đ/C: Số 449 Bạch Mai, Hai Bà Trưng, Hà Nội./Kích thước: 33*9*33 cm/Thành phần: Nhựa An Toàn/Xuất xứ thương hiệu: Mỹ/Nơi SX: Trung Quốc/Năm SX: 2020/Độ tuổi phù hợp: từ 1 tuổi trở lên/SP phù hợp với QCVN 3:2009/BKHCN/NHÀ SÁCH TÂN VIỆT - NÂNG TẦM TRI THỨC/Màu sắc: màu tím.', '2000', '2021-09-12', '2021-09-09', '2021-10-26', 2, '80-155453 My Laptop ', 'Đã duyệt', 5, 'nha123'),
(46, 20000000, '13:30:00', '16:30:00', 'img_46.jpg', 'THÔNG TIN CHI TIẾT/Công nghệ âm thanh: HD Audio with DTS X Ultra/hời gian pin: MobileMark 2018: Up to 16.5 hours; MobileMark 2014: Up to 22 hours; Video playback: Up to 24.5 hours; JEITA 2.0: Up to 30 hours/Bluetooth: BT 5.1/Thương hiệu: LG/Xuất xứ thương hiệu: Hàn Quốc/Camera: HD Webcam with Dual Mic./Card đồ họa: Intel Iris Xe Graphics (i7,i5)/Card Reader: UFS/ Micro SD/Kết nối: HP-Out(4Pole Headset, US type), USB 3.2 Gen2x1 (x2), HDMI, USB 4 Gen3x2 Type C (x2, with Power Delivery, Display Port, Thunderbolt 4)/CPU: Intel 11th Generation i5(Quad Core) i5-1135G7 (2.4 GHz, Turbo up to 4.2 GHz, L3 Cache 8MB, 28 W) - QC/Kích thước: 355.9 x 243.4 x 16.8 mm hoặc 14.01 x 9.58 x 0.66"/Loại, Công nghệ màn hình: 16.0"(40.6cm) WQXGA (2560*1600) IPS LCD, (Non-Touch), DCI-P3 99% (Typical, min 95%)/Dung lượng ổ cứng: M.2(2280) Dual SSD slots - NVME: 512GB/Loại pin: 80 Wh Li-Ion/Xuất xứ: Trung Quốc/Trọng lượng: 1,190g / 2.62 lbs/RAM: 8GB LPDDR4X (Dual Channel)/Kích thước màn hình: 16 inch/Hệ điều hành: Non-OS/Wifi: Intel Wireless-AX201 (802.11ax, 2x2, Dual Band, BT Combo)/Màu sắc: màu trắng.', '20000', '2021-09-15', '2021-09-12', '2021-10-02', 1, 'Laptop LG Gram 2021 16ZD90P-G.AX54A5 ', 'Không duyệt', 5, 'thangnguyen'),
(47, 69000, '10:55:00', '11:15:00', 'img_47.jpg', 'Màu sắc: màu đen.', '1000', '2021-09-12', '2021-09-08', '2021-09-26', 2, 'Sạc dành cho laptop Asus 19V-3.42A - Vuông - Chân nhỏ 65W',  'Chưa duyệt', 5, 'khoatran'),
(48, 1000, '13:50:00', '15:10:00', 'img_48.jpg', 'THÔNG TIN CHI TIẾT/Thương hiệu: OEM/Xuất xứ thương hiệu: China/Xuất xứ: china/Kích thước: 34x26x3/Màu sắc: màu đen.', '1000', '2021-09-15', '2021-09-07', '2021-10-30', 5, 'Backlight Computer Radiator Black White Thin USB ', 'Đã duyệt', 5, 'quynhnhu'),
(49, 1000, '15:30:00', '19:30:00', 'img_49.jpg', 'Đặc điểm nổi bật/- Kích thước 45cm x 31cm x 11cm./Kích thước không quá lớn nhưng kích thước đủ để bạn chứa tất cả những vật dụng cần thiết tiện lợi khi đi du lịch, chơi thể thao, đi học, đi làm… Những ngăn nhỏ giúp bạn thỏa mái để những vật nhỏ như chìa khóa, cart, thẻ ATM…/- Thiết kế hiện đại, tiện dụng Thiết kế mang hơi hướng hiện đại, vừa đơn giản, vừa sang trọng. Sản phẩm chắc chắn sẽ khiến bạn trở nên tươm tất, phong cách và đẳng cấp khi đi du lịch, đi chơi thể thao hay đi học./- Chất liệu chuyên dụng cao cấp gia công bằng chất liệu vải Cao cấp đảm bảo độ bền chắc theo thời gian. Loại chất liệu này góp phần hạn chế tối đa tình trạng sờn cũ, phai màu sau một thời gian dài sử dụng./- Đường may sắc nét, chắc chắn Sản phẩm được chế tác bằng những đường may tỉ mỉ và chắc chắn,/- Sản phẩm mang tính ứng dụng cao, có thể sử dụng trong nhiều hoàn cảnh: đi du lịch, đi học, đi chơi thể thao,… với những trang phục năng động như quần jeans, áo thun phông, áo khoác da, quần lửng kaki/Màu sắc: màu đen.', '8000', '2021-09-15', '2021-09-07', '2021-09-30', 1, 'Balo laptop  laptop 15.6inch  BL9003', 'Không duyệt', 5, 'nganguyen'),
(50, 20000000, '14:00:00', '16:00:00', 'img_50.jpg', 'Thương hiệu: Apple/Trọng lượng: 1.4 kg/Kích thước màn hình: 13.3 inch/Màu sắc: màu bạc.', '25000', '2021-09-23', '2021-09-15', '2021-10-05', 1, 'Apple Macbook Pro 2020 M1 - 13 Inchs ', 'Đã duyệt', 5, 'khoatran'),
(51, 10000, '14:30:00', '15:30:00', 'img_51.jpg', 'Mô tả sản phẩm/- Men wristwatch./- Easily mixes and matches with most outfits./- Circular dial with analog time-telling display./- Made from lightweight and durable material./- Can be worn daily or whenever needed./- Dial size : 3.8 cm./- Strap length : 4 cm. (adjustable)/- Colour: Black.', '1000', '2021-09-14', '2021-09-07', '2021-09-30', 1, 'MONACHIO Men Watch',    'Đã duyệt', 6, 'khoatran'),
(52, 10000, '15:00:00', '16:00:00', 'img_52.jpg', 'Mô tả sản phẩm/- Men wristwatch./- Easily mixes and matches with most outfits./- Circular dial with analog time-telling display./- Made from lightweight and durable material./- Can be worn daily or whenever needed./- Size : 4.2 cm x 23 cm. (adjustable)/- Colour: Yellow.', '1000', '2021-09-14', '2021-09-07', '2021-09-30', 1, 'MONACHIO Men Watch', 'Đã duyệt', 6, 'nha123'),
(53, 50000, '09:59:00', '11:59:00', 'img_53.jpg', 'Mô tả sản phẩm/- Men wristwatch./- Modern design that easily matches with most outfits./- Circular dial with analog time telling system./- Can be worn daily or whenever needed./- Dial size : 6.5 cm./- Strap length : 4 cm./- Colour: Black.', '7000', '2021-09-16', '2021-09-10', '2021-09-29', 5, 'MONACHIO Wristwatch', 'Đã duyệt', 6, 'nha123'),
(54, 1000, '09:30:00', '11:30:00', 'img_54.jpg', 'Mô tả sản phẩm/- Frame size: 4 x 4 cm./- Strap length: 16 cm./- Comes with a separate minute and hour time display and a compass./- Time adjustment system with simple buttons on the side./- Shinny silver aluminium frame and watchband./- Colour: Silver.', '1000', '2021-09-15', '2021-09-10', '2021-09-27', 3, 'NEAT Men Watch','Đã duyệt', 6, 'quynhnhu'),
(55, 28000000, '09:30:00', '11:30:00', 'img_55.jpg', 'Mô tả sản phẩm/- Digital Watch, ideal for sports and other activities./- The perfect accessory for your workout session./- Durable silicone strap that is also water-resistant./- Function includes digital time-telling and date at the top screen./- Quantity : 1 pc./- Colour: White.', '8000', '2021-09-15', '2021-09-07', '2021-09-30', 7, 'Digital Sports Watch',   'Đã duyệt', 6, 'khoatran'),
(56, 20000, '13:00:00', '15:00:00', 'img_56.jpg', 'Mô tả sản phẩm/- Men wristwatch./- Square dial easy match perfectly on working day outfit or on simple casual day./- Easy-to-use digital time telling system./- Silicone straps are comfortable and flexible./- Size : 3.5 x 22 cm./- Colour: Black.', '1000', '2021-09-13', '2021-09-06', '2021-09-27', 3, 'Digital Watch for Men', 'Đã duyệt', 6, 'quynhnhu'),
(57, 20000, '09:30:00', '11:30:00', 'img_57.jpg', 'Mô tả sản phẩm/- Digital watch with a sporty and modern design for men./- LED screen is bright and allows for touchscreen functionality as well./- Water resistant to up to 50 m. and can be worn while swimming./- Time is displayed digitally and comes with an easy-to-use calendar./- Watch strap is made of flexible and durable silicone./- Dial size : 3.5 x 4 x 1 cm./- Strap length : 23 cm./- Colour: Black.', '9000', '2021-09-16', '2021-09-07', '2021-10-28', 5, 'LED Electronic Watch','Đã duyệt', 6, 'nha123'),
(58, 20000, '08:30:00', '10:30:00', 'img_58.jpg', 'Mô tả sản phẩm/- Classic leather watch for every gender./- Suitable for an outdoing event or to complement business attire on a working day./- Circular dial with analog time telling system./- PU leather strap is very durable and classy looking style./- Easy to use and match./- Size : 5 x 1.5 x 26.5 cm.', '8000', '2021-09-17', '2021-09-14', '2021-09-30', 2, 'MONACHIO Classic Watch',  'Chưa duyệt', 6, 'khoatran'),
(59, 20000, '08:30:00', '10:30:00', 'img_59.jpg', 'Mô tả sản phẩm/- Classic leather watch for every gender./- Suitable for an outdoing event or to complement business attire on a working day./- Circular dial with analog time telling system./- PU leather strap is very durable and classy looking style./- Easy to use and match./- Size : 5 x 1.5 x 26.5 cm.', '8000', '2021-09-17', '2021-09-14', '2021-09-30', 2, 'MONACHIO Classic Watch',    'Đã duyệt', 6, 'khoatran'),
(60, 20000, '09:30:00', '11:30:00', 'img_60.jpg', 'Colour:  Green.', '9000', '2021-09-14', '2021-09-08', '2021-09-27', 50, 'MONACHIO Men Watch',  'Chưa duyệt', 6,'quynhnhu');


insert into don_hang
values
(1, '93 Hành Thiện, Nghĩa Hành, Quảng Ngãi', '2021-08-03', '0338172611', 325000, 'Đã giao', 1),
(2, '172 Đống Đa, Hoàng Mai, Hà Nội', '2021-08-05', '0382716253', 575000, 'Đang giao', 1),
(3, '87 Cao Thắng, Hải Châu, Đà Nẵng', '2021-08-28', '0998736152', 210000, 'Đã hủy', 3),
(4, '231 Ngô Quyền, Tam Kỳ, Quảng Nam', '2021-07-07', '0822716251', 730000,'Đang giao', 4),
(5, '73 Quang Trung, TP Quảng Ngãi, Quảng Ngãi', '2021-07-21', '0334152637', 128000, 'Đã giao', 6),
(6, '91 Trương Định, Hải Châu, Đà Nẵng', '2021-08-01', '0978162514', 1050000, 'Đã giao', 7),
(7, '172 Ông Ích Khiêm, Hải Châu, Đà Nẵng', '2021-08-17', '0383281716', 550000, 'Đang giao', 7),
(8, '91 Lý Thường Kiệt, Cẩm Lệ, Đà Nẵng', '2021-08-27', '0996152411', 645000, 'Đã hủy', 9),
(9, '77 Hoàng Diệu, Điện Bàn, Quảng Nam', '2021-07-11', '0887162514', 930000, 'Đã giao', 9),
(10, '10 Trần Chí, Hương Trà, Huế', '2020-09-01', '0857463522', 2250000, 'Đang giao', 10),
(11, '193 Đinh Tiên Hoàng, Hội An, Quảng Nam', '2021-07-07', '0997091287', 1350000, 'Đã giao', 10),
(12, '91 Bạch Đằng, Hải Châu, Đà Nẵng', '2021-08-07', '0372615271', 950000, 'Đã giao', 11),
(13, '73 Nguyễn Hữu Thọ, Tam Kỳ, Quảng Nam', '2021-08-03', '0377021220', 435000, 'Đang giao', 12),
(14, '11 Nguyễn Công Phương, Nghĩa Hành, Quảng Ngãi', '2021-08-17', '0321625172', 110000, 'Đã hủy', 14),
(15, '110 Điện Biên Phủ, Thanh Khê, Đà Nẵng', '2021-08-10', '0975361524', 559000, 'Đã hủy', 15);

insert into chi_tiet_don_hang
values
(1, 1, 1, 420000),
(2, 2, 1, 300000),
(3, 4, 1, 450000),
(4, 7, 1, 335000),
(5, 3, 1, 175000),
(6, 10, 1, 225000),
(7, 12, 1, 700000),
(8, 20, 1, 1050000),
(10, 13, 1, 375000),
(11, 22, 1, 2750000),
(12, 27, 1, 1750000),
(13, 24, 1, 975000),
(14, 25, 1, 825000),
(15, 30, 1, 3150000);




insert into dau_gia
values
(1,1),
(2,2),
(3,3),
(4,4),
(5,5),
(6,6),
(7,7),
(8,8),
(9,9),
(10,10),
(11,11),
(12,12),
(13,13),
(14,14),
(15,15);


insert into chi_tiet_dau_gia
values
(1,1,3000,'19:00:30'),
(1,2,48000,'21:02:00'),
(3,3,69000,'04:00:00'),
(4,4,120000,'18:00:02'),
(5,5,30000,'00:00:00'),
(6,6,11000,'14:30:00'),
(7,7,62000,'16:00:00'),
(8,8,98000,'00:00:00'),
(9,9,56000,'14:30:00'),
(10,10,52000,'00:00:00'),
(11,11,64000,'20:00:06'),
(12,12,25000,'00:00:00'),
(13,13,99000,'22:00:00'),
(14,14,12000,'00:00:00'),
(15,15,560000,'19:00:30');

-- ngày hiện tại 
SELECT *FROM san_pham WHERE ngay_bat_dau >= (SELECT CURDATE()) and  ngay_ket_thuc > (SELECT CURDATE());

select * from  san_pham  where tinh_trang = 'Đã duyệt' and  ngay_bat_dau <= current_date  and  ngay_ket_thuc  > current_date ;

