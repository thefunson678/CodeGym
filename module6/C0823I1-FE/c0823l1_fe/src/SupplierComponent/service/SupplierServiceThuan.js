    import axios from "axios";

// Hàm list nhà cung cấp với các tham số lọc bao gồm địa chỉ và phân trang
export const list = async (address = "", searchTerm = "", page = 0, size = 5, sortField = 'phone', sortOrder = 'desc') => {
    try {
        const response = await axios.get("http://localhost:1010/api/supplier/search", {
            params: {
                address: address,
                search: searchTerm,
                page: page,
                size: size,
                sort: `${sortField},${sortOrder}`
            }
        });
        console.log(response.data)
        return response.data; // Trả về dữ liệu phân trang từ API
    } catch (err) {
        console.log(err);
    }
};


// Hàm xóa nhiều nhà cung cấp theo UID
export const deleteSuppliersByUid = async (uids) => {
    try {
        const response = await axios.post('http://localhost:1010/api/supplier/deleteByUid', uids, {
            headers: {
                'Content-Type': 'application/json',
            }
        });
        return response.data;
    } catch (error) {
        console.error("Failed to delete suppliers:", error);
        throw error;
    }
};



// Hàm lấy toàn bộ danh sách nhà cung cấp
export const listSupplier = async () => {
    try {
        const response = await axios.get("http://localhost:1010/api/supplier");
        return response.data.content; // Nếu API trả về cấu trúc giống như phân trang
    } catch (err) {
        console.error("Failed to fetch all suppliers:", err);
        throw err;
    }
}
