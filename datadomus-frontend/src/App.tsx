import "./App.css";
import React, {useState} from "react";
import axios from "axios";

function App() {
    const [name, setName] = useState("");
    const [message, setMessage] = useState("");

    const handleSubmit = (e: React.FormEvent) => {
        e.preventDefault()
            const url = 'http://localhost:8080/user/create'
            const data = {
                userName: name
            };
            axios
                .post(url, data, {
                    headers: {
                        withCredentials: false,
                        "Accept": "application/json",
                        "Content-Type": "application/json",
                    },
                })
                .then(({data}) => {
                    setName("")
                    setMessage("Usuário criado com sucesso")
                    console.log(data);
                }).catch((err) => {
                setName("")
                    setMessage("Erro na criação de usuário")
                    console.log(err)
            });
    };

    return (
        <div className="App">
            <form onSubmit={handleSubmit}>
                <input
                    type="text"
                    value={name}
                    placeholder="Nome do usuário"
                    onChange={(e) => setName(e.target.value)}
                />

                <button type="submit">Criar usuario</button>

                <div className="message">{message ? <p>{message}</p> : null}</div>
            </form>
        </div>
    );
}

export default App;