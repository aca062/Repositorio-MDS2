import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-listas_de_reproduccion_ajenas';
import './vista-canciones_mas_escuchadas';
import './vista-artistas_similares';
import './vista-lista_album';
import './vista-listas_de_reproduccion_propias';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-perfil_artista_comun')
export class VistaPerfil_artista_comun extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="width: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;">
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; flex-shrink: 1; align-self: center; align-items: center; width: fit-content;">
    <img style="width: 200px; padding-top: var(--lumo-space-l); padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l);" src="https://i.scdn.co/image/ab6761610000e5eb6ad57a3cb26ae3ffd0f28f22">
    <vaadin-button>
      Editar 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; width: 50%;">
    <vaadin-horizontal-layout style="width: 100%; justify-content: space-between;">
     <h5 style="margin-top: 40px;">Bad Bunny</h5>
     <vaadin-button style="margin-right: 10%;">
       Dejar de seguir 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="align-items: center;">
     <h5>bbunny@gmail.com</h5>
     <vaadin-button>
       Editar 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center;">
    <h5>Seguidores</h5>
    <h5>80000000</h5>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center;">
    <h5>Seguidos</h5>
    <h5>10</h5>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-button style="align-self: flex-end; margin: var(--lumo-space-m);">
    Recibir notificaciones 
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: flex-start;">
  <vista-listas_de_reproduccion_propias style="margin-left: var(--lumo-space-xl);"></vista-listas_de_reproduccion_propias>
  <vaadin-button style="margin: var(--lumo-space-m);">
    Crear una nueva lista 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="justify-content: flex-end; align-self: flex-start; width: 100%;">
  <vista-listas_de_reproduccion_ajenas style="width: 100%; margin-left: var(--lumo-space-xl);"></vista-listas_de_reproduccion_ajenas>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
  <vaadin-vertical-layout theme="spacing" style="width: 100%;">
   <vista-canciones_mas_escuchadas style="align-self: center;"></vista-canciones_mas_escuchadas>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%;">
   <vista-artistas_similares style="align-self: center;"></vista-artistas_similares>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%;">
   <vista-lista_album style="align-self: center;"></vista-lista_album>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
   <vaadin-horizontal-layout style="width: 100%; margin-left: var(--lumo-space-xl);">
    <h2 style="margin-top: var(--lumo-space-xl); margin-right: var(--lumo-space-l); margin-left: var(--lumo-space-l); align-self: center;">Festivales y Conciertos</h2>
    <vaadin-button style="margin-top: var(--lumo-space-xl);">
     Añadir
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
   <vaadin-vertical-layout theme="spacing" style="width: 100%;">
    <vaadin-horizontal-layout style="object-fit: cover; margin: var(--lumo-space-l); align-self: center;">
     <img style="width: 150px;" src="https://cdn-icons-png.flaticon.com/512/42/42956.png">
     <vaadin-vertical-layout style="justify-content: space-around; margin-left: var(--lumo-space-l); align-self: center;">
      <h5>1.00</h5>
      <h5>Capital One Arena</h5>
     </vaadin-vertical-layout>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout style="object-fit: cover; margin: var(--lumo-space-l); align-self: center;">
     <img style="width: 150px;" src="https://cdn-icons-png.flaticon.com/512/42/42956.png">
     <vaadin-vertical-layout style="justify-content: space-around; margin-left: var(--lumo-space-l);">
      <h5>1.00</h5>
      <h5>State Farm Arena</h5>
     </vaadin-vertical-layout>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 100%;">
    <vaadin-vertical-layout theme="spacing" style="width: 100%;">
     <vaadin-horizontal-layout style="object-fit: cover; margin: var(--lumo-space-l); align-self: center;">
      <img style="width: 150px;" src="https://cdn-icons-png.flaticon.com/512/42/42956.png">
      <vaadin-vertical-layout style="justify-content: space-around; margin-left: var(--lumo-space-l);">
       <h5>1.00</h5>
       <h5>Spectrum Center</h5>
      </vaadin-vertical-layout>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout style="object-fit: cover; margin: var(--lumo-space-l); align-self: center;">
      <img style="width: 150px;" src="https://cdn-icons-png.flaticon.com/512/42/42956.png">
      <vaadin-vertical-layout style="justify-content: space-around; margin-left: var(--lumo-space-l);">
       <h5>2.00</h5>
       <h5>Amway Center</h5>
      </vaadin-vertical-layout>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: flex-end;">
  <vaadin-button style="margin: var(--lumo-space-m);">
    Darse de baja 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
