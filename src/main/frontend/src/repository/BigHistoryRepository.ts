import axios from "axios";

// BigHistoryRepository.ts
class BigHistoryRepository {
	constructor() {
	}

	async root(request?: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.get("./api/0?expandChildren=true")
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async search(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.post("./api/search", request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
	async update(request: any, onSuccess?: any, onError?: any, element?: any) {
		return axios.put("./api/" + request.id, request)
			.then(response => onSuccess && onSuccess(request, response.data, element))
			.catch(error => onError && onError(request, error, element));
	}
}
export default new BigHistoryRepository();
