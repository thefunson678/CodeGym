import axios from "axios";

    const BASE_URL = "http://localhost:1010";

export const createSupplier = async (supplier,token) => {
    try {
        const response = await axios.post(`${BASE_URL}/api/supplier/create`, supplier,
            {
                headers: {Authorization: `Bearer ${token}`}
            }
            )
        return response;
    } catch (err){
        return false;
    }
}

export const findSupplierById = async (supplierId,token) => {
    try {
        const response = await axios.get(`${BASE_URL}/api/supplier/${supplierId}`,
            {
                headers: {Authorization: `Bearer ${token}`}
            }
        )
        return response.data;
    } catch (err){
        return null;
    }
}
export const updateSupplier = async (supplier,token,supplierId) => {

    try {
        console.log(supplier);
        console.log(supplierId);
        const response = await axios.put(`${BASE_URL}/api/supplier/update/${supplierId}`, supplier,
            {
                headers: {Authorization: `Bearer ${token}`}
            }
        )
        return response;
    } catch (err){
        return false;
    }
}
