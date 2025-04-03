# solutionofhomework2_VSK2 EXPLANATION
![homework1_vsk2](https://github.com/user-attachments/assets/03994143-9404-4f06-bbb7-1691977c679b)
UML-->
//www.plantuml.com/plantuml/png/ZP5HQiCm44J_TOhvTAYJ0vWI0eL0eIs5q0EezYOHbIMZLMXDwDrhnuwwCO7aTpGxRqUxugX3FDHM6HSfR7L9UAxrZXX71G0Fg0mtLhVhWxMdbsocVfKghMR6YzTLUe2f6qirkSYN6NDiZQKtNHCAR68mRZTcMpcVdLspEyZlmV-qrx69AjCxzEMsDpPB-VUk9HQQpvVZ1wWpqamVX7snM4BuqgeCxsoBxpqvEAAAAhKYL_N7IcSRV-DLXo-AczZQ__Qcz4wswhNIMn-c8dTZq_uoCUkJyc4sXzMVP4zwNrlomqbTwpBwqE8eqnb5vsaU1qGk_SiHkBj5Go779BiPT77tKaSZsa-AofW1dZAoysmEJXsljEilAMGKU0ga8p5yGA034wiKUiNzqHd0Unse6a3fj7y0
Proxy Pattern – Explanation
What problem was solved?
In a real estate agency's image management system, agents upload high-resolution property images. If these images are loaded immediately on the website, it causes slow performance and high resource consumption. The Proxy Pattern is used to load a low-resolution thumbnail first, and only when the user requests the full-resolution image (such as by clicking to zoom), is the high-resolution image loaded.

How did the pattern simplify or optimize the design?
The Proxy Pattern introduces a proxy object that acts as a placeholder for the real image. Initially, a low-resolution image is displayed, and the full-resolution image is only loaded when requested. This lazy loading improves the performance by reducing the initial load time and saving bandwidth. The Protection Proxy ensures that only authorized agents (logged-in agents) can upload or replace images, ensuring access control.

Flyweight Pattern – Explanation
What problem was solved?
In a map application displaying thousands of location markers (gas stations, restaurants, hospitals), each marker shares common properties like icon, color, and label style. Without optimization, this leads to excessive memory usage by creating a new object for each marker with similar attributes. The Flyweight Pattern is used to share common marker styles across markers, reducing memory usage.

How did the pattern simplify or optimize the design?
The Flyweight Pattern allows the system to reuse shared MarkerStyle objects for common attributes like icon, color, and label style. Instead of creating a new object for each marker, the system checks for existing styles using a MarkerStyleFactory and reuses them. This significantly reduces memory usage, as only one instance of each style is created and shared across multiple markers, improving the application's scalability.

