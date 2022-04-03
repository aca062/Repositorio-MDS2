import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-listas_de_reproduccion_propias';

@customElement('vista-perfil')
export class VistaPerfil extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="vaadinVerticalLayout1">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-xl);" id="vaadinHorizontalLayout">
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; flex-shrink: 1; align-self: center; align-items: center; width: fit-content;" id="vaadinVerticalLayout2">
    <img style="width: 200px; padding-top: var(--lumo-space-l); padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l);" src="https://i.pinimg.com/736x/cb/5d/64/cb5d64be736ab84602ee1bcd20303d4e.jpg" id="img">
    <vaadin-button id="vaadinButton">
      Editar 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; width: 50%;" id="vaadinVerticalLayout3">
    <h5 style="margin-top: 40px;" id="h5">Paco12</h5>
    <vaadin-horizontal-layout theme="spacing" style="align-items: center;" id="vaadinHorizontalLayout1">
     <h5 id="h51">Pakito12@gmail.com</h5>
     <vaadin-button id="vaadinButton1">
       Editar 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center;" id="vaadinVerticalLayout4">
    <h5 id="h52">Seguidores</h5>
    <h5 id="h53">9</h5>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center;" id="vaadinVerticalLayout5">
    <h5 id="h54">Seguidos</h5>
    <h5 id="h55">120</h5>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-button style="align-self: flex-end; margin: var(--lumo-space-m);" id="vaadinButton2">
    Recibir notificaciones 
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: space-between;" id="vaadinHorizontalLayout2">
  <vista-listas_de_reproduccion_propias style="background-color: var(--lumo-contrast-10pct);" id="vistaListas_de_reproduccion_propias"></vista-listas_de_reproduccion_propias>
  <vaadin-button style="margin: var(--lumo-space-m);" id="vaadinButton3">
    Crear una nueva lista 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: flex-end;" id="vaadinHorizontalLayout3">
  <vaadin-button style="margin: var(--lumo-space-m);" id="vaadinButton4">
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
